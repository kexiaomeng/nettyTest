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
        ctx.writeAndFlush("successsss");
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
