import com.sun.test.MyClientHandler;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.FixedLengthFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Client {
    private EventLoopGroup workGroup = new NioEventLoopGroup();
    private Bootstrap bootstrap = new Bootstrap();
    private String host;
    private int port;
    private  ChannelFuture future = null;
    public   ChannelFuture getFuture(){
        return future;
    }
    public EventLoopGroup getWorkGroup(){
        return workGroup;
    }




    public Client(String host, int port){
        this.port = port;
        this.host = host;
    }



    public void connect() throws IOException {
        try {
            bootstrap.group(workGroup)
                    .channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<SocketChannel>() {
                        protected void initChannel(SocketChannel socketChannel) throws Exception {
                            //防止粘包
                            socketChannel.pipeline().addLast(new FixedLengthFrameDecoder(10));
                            socketChannel.pipeline().addLast(new StringDecoder());  //编解码器
                            socketChannel.pipeline().addLast(new StringEncoder());
                            socketChannel.pipeline().addLast(new MyClientHandler());

                        }
                    })
                    .option(ChannelOption.SO_BACKLOG, 1024);

             future = bootstrap.connect(host, port).sync();

//            future.channel().closeFuture().sync();

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("wait for sysin");
            for (; ; ) {
                String line = reader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);

                future.channel().writeAndFlush(line);

                if ("ssssssssss".equals(line)) {
                    System.out.println("exit");
                    try {
                        future.channel().closeFuture().sync();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
                }


            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            workGroup.shutdownGracefully();
        }


    }

    public static void main(String args[]) throws InterruptedException, IOException {

        Client client = new Client("localhost", 8080);
        client.connect();





    }

}
