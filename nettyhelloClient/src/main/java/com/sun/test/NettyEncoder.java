package com.sun.test;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelHandler.Sharable;
import io.netty.handler.codec.MessageToByteEncoder;

@Component
@Scope(value = "prototype")

public class NettyEncoder extends MessageToByteEncoder<byte []>{

	@Override
	protected void encode(ChannelHandlerContext cxt, byte[] in, ByteBuf out){
		try {
			out.writeBytes(in);	

		} catch (Exception e) {
			System.out.println("编码失败"+e);
			out.clear();
		}
	}

	

}
