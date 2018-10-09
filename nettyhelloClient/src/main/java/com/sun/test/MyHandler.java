package com.sun.test;

import io.netty.channel.*;


@ChannelHandler.Sharable
public class MyHandler extends ChannelHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {

        boolean close = false;
        String context  = (String)msg;
        System.out.println("Receive message : "+context);
        if ("ssssssssss".equals(context)) {
            close = true;
        }

        ChannelFuture future = ctx.writeAndFlush("back to client");
        if (close) {
            future.addListener(ChannelFutureListener.CLOSE);
        }
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