package com.example.nio;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class Server {

    public static void main(String[] args) throws InterruptedException {
        // 第一步创建两个线程组
        // 第一个线程组是用于接收client端连接的
        EventLoopGroup bossGroup = new NioEventLoopGroup();
        // 第二个线程组是实际处理业务操作
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        // 第二部分 配置
        ServerBootstrap b = new ServerBootstrap();
        b.group(bossGroup, workerGroup)
                .channel(NioServerSocketChannel.class)
                // 使用childHandler 去绑定具体的时间处理器
                .childHandler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel socketChannel) throws Exception {
                        socketChannel.pipeline().addLast(new ServerHandler());
                    }
                })
                // 设置tcp 缓冲区
                .option(ChannelOption.SO_BACKLOG, 128)
                // 保持连接
                .option(ChannelOption.SO_KEEPALIVE, true);
        // 绑定指定端口 监听
        ChannelFuture f = b.bind(8765).sync();
        f.channel().closeFuture().sync();
        bossGroup.shutdownGracefully();
        workerGroup.shutdownGracefully();

    }

}
