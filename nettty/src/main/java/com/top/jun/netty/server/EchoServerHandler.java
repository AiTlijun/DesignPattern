package com.top.jun.netty.server;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.*;
import io.netty.util.CharsetUtil;

import java.nio.Buffer;

/**
 * @ClassName: EchoServerHandler
 * @Description: EchoServerHandler
 * @Author: lijun
 * @Date: 2019/4/19 0019下午 7:49
 * @Version: 1.0.0$
 **/

/*  1.@Sharable 标识这类的实例之间可以在 channel 里面共享
    2.日志消息输出到控制台
    3.将所接收的消息返回给发送者。注意，这还没有冲刷数据
    4.冲刷所有待审消息到远程节点。关闭通道后，操作完成
    5.打印异常堆栈跟踪
    6.关闭通道*/
@ChannelHandler.Sharable
public class EchoServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRegistered(ChannelHandlerContext ctx) throws Exception {
        super.channelRegistered(ctx);
    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf byteBuf = (ByteBuf) msg;
        System.out.println("Server received: " + byteBuf.toString(CharsetUtil.UTF_8));
        ctx.write(byteBuf);
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) throws Exception {
        super.channelReadComplete(ctx);
    }

    @Override
    public void channelWritabilityChanged(ChannelHandlerContext ctx) throws Exception {
        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER)//4
                .addListener(ChannelFutureListener.CLOSE);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();                //5
        ctx.close();
    }
}
