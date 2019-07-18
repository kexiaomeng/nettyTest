package com.sun.test;


import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;

public class MyClientHandler extends ChannelHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {

        String context  = (String)msg;
        System.out.println("Receive message from server: "+context);

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        System.out.print("连接到服务端");

//        ctx.writeAndFlush(hexStringToByteArray("689A009A00684B810845E42700260D604001FF0206054001FF0306054001FF0106054001FF0406051002FF0206051002FF0306051002FF0106051002FF0406058006FF0206058006FF0306058006FF0106058006FF040605080CFF020605080CFF030605080CFF010605080CFF040605040FFF020605040FFF030605040FFF010605040FFF0406051016FF0206051016FF0306051016FF0106051016FF0406057B16"));
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

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.flush();
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause)throws Exception
    {
        ctx.close();
        ctx.fireExceptionCaught(cause);
    }
}
