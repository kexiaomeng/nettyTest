import com.sun.test.MyClientHandler;
import com.sun.test.NettyEncoder;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.FixedLengthFrameDecoder;
import io.netty.handler.codec.string.StringDecoder;

import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class Client implements Runnable{
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
                            socketChannel.pipeline().addLast(new NettyEncoder());
                            socketChannel.pipeline().addLast(new MyClientHandler());

                        }
                    })
                    .option(ChannelOption.SO_BACKLOG, 1024);

             future = bootstrap.connect(host, port).sync();

//            future.channel().closeFuture().sync();

//            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//            System.out.print("wait for sysin");
//            for (; ; ) {
//                String line = reader.readLine();
//                if (line == null) {
//                    break;
//                }
//                System.out.println(line);
//
//                future.channel().writeAndFlush(line);
//
//                if ("ssssssssss".equals(line)) {
//                    System.out.println("exit");
//                    try {
//                        future.channel().closeFuture().sync();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    break;
//                }
//
//
//            }

            Channel ctx = future.channel();
            for (int i = 0;i<1;i++){
                ctx.writeAndFlush(hexStringToByteArray("689A009A00684B810845E42700260D604001FF0206054001FF0306054001FF0106054001FF0406051002FF0206051002FF0306051002FF0106051002FF0406058006FF0206058006FF0306058006FF0106058006FF040605080CFF020605080CFF030605080CFF010605080CFF040605040FFF020605040FFF030605040FFF010605040FFF0406051016FF0206051016FF0306051016FF0106051016FF0406057B16"));
                Thread.sleep(1000L);
            }
            System.out.println("enddddddddddddddd");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            workGroup.shutdownGracefully();
        }


    }

    public static void main(String args[]) throws InterruptedException, IOException {

        ExecutorService executors =  Executors.newFixedThreadPool(20000);

        for (int i = 0;i < 20000;i++){
            executors.submit(new Client("localhost", 9013));
        }





    }


    public static byte[] hexStringToByteArray(String hexString) {
        int length = hexString.length();
        byte[] buffer = new byte[length / 2];

        for (int i = 0; i < length; i += 2) {
            buffer[i / 2] = (byte) ((toByte(hexString.charAt(i)) << 4) | toByte(hexString
                    .charAt(i + 1)));
        }

        return buffer;
    }

    private static int toByte(char c) {
        if (c >= '0' && c <= '9')
            return (c - '0');
        if (c >= 'A' && c <= 'F')
            return (c - 'A' + 10);
        if (c >= 'a' && c <= 'f')
            return (c - 'a' + 10);

        throw new RuntimeException("Invalid hex char '" + c + "'");
    }

    public void run() {
        try {
            connect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
