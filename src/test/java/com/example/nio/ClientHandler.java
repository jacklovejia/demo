package com.example.nio;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerAdapter;
import io.netty.channel.ChannelHandlerContext;
import io.netty.util.ReferenceCountUtil;

import java.io.UnsupportedEncodingException;

public class ClientHandler extends ChannelHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws UnsupportedEncodingException {
//        ((ByteBuf) msg).release();
        try {
            ByteBuf buf = ((ByteBuf) msg);
            byte[] res = new byte[buf.readableBytes()];
            buf.readBytes(res);
            String body = new String(res, "utf-8");
            System.out.println("客户端收到返回结果:" + body);

        } finally {
            ReferenceCountUtil.release(msg);
        }
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}
