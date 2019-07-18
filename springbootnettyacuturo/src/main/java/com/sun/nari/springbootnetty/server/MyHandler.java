package com.sun.nari.springbootnetty.server;

import io.netty.channel.*;
import org.springframework.stereotype.Component;


@ChannelHandler.Sharable
@Component
public class MyHandler extends ChannelHandlerAdapter {

    public void channelRead(ChannelHandlerContext ctx, Object msg) {

        boolean close = false;
        String context  = (String)msg;
        System.out.println("Receive message : "+context);
        if ("ssssssssss".equals(context)) {
            close = true;
        }

        ChannelFuture future = ctx.writeAndFlush("gggggg");
        if (close) {
            future.addListener(ChannelFutureListener.CLOSE);
        }
    }

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