package com.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;

public class NioServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        ServerSocketChannel ssc = ServerSocketChannel.open();
        ssc.configureBlocking(false);//非阻塞
        ssc.socket().bind(new InetSocketAddress(8080));
        while (true) {
            SocketChannel accept = ssc.accept();
            if (accept != null) {
                ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
                accept.read(byteBuffer);
                System.out.println("接受"+new String(byteBuffer.array()));
                byteBuffer.flip();
                accept.write(byteBuffer);
            } else {
                TimeUnit.SECONDS.sleep(1);
                System.out.println("无数据");
            }
        }
    }
}
