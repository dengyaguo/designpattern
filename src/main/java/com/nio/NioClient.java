package com.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.concurrent.TimeUnit;

public class NioClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        SocketChannel ssc = SocketChannel.open();
        ssc.connect(new InetSocketAddress("localhost", 8080));
        if(ssc.isConnectionPending()){
            ssc.finishConnect();
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        byteBuffer.put("hello nio".getBytes());
        byteBuffer.flip();
        ssc.write(byteBuffer);
        byteBuffer.clear();
        int read = ssc.read(byteBuffer);
        System.out.println(read +" "+new String(byteBuffer.array()));
    }
}
