package com.basejava;

import cn.hutool.core.io.IoUtil;
import sun.misc.IOUtils;

import java.io.*;
import java.nio.channels.FileChannel;

public class IOUtil {

    public static void main(String[] args) throws IOException {

        String str = "hello,rollenholt";

        PushbackInputStream push = null;

        ByteArrayInputStream bat = null;

        bat = new ByteArrayInputStream(str.getBytes());

        push = new PushbackInputStream(bat);

        int temp = 0;

        while((temp = push.read()) != -1){

            if(temp == ','){

                push.unread(temp);

                temp = push.read();

                System.out.print("(»ØÍË" + (char) temp + ") ");

            }else{

                System.out.print((char) temp);

            }

        }

    }
}
