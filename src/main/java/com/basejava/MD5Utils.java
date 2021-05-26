package com.basejava;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import org.springframework.util.CollectionUtils;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.*;
import java.util.Date;
import java.util.Random;

public class MD5Utils {

    private static final String MD5 = "MD5";


    public static String getMD5Str(String str) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance(MD5);

            messageDigest.reset();

            messageDigest.update(str.getBytes(StandardCharsets.UTF_8));

        } catch (NoSuchAlgorithmException e) {
            System.out.println("NoSuchAlgorithmException caught!");
            e.printStackTrace();
            System.exit(-1);
        }

        byte[] byteArray = messageDigest.digest();

        StringBuffer md5StrBuff = new StringBuffer();

        for (int i = 0; i < byteArray.length; i++) {
            if (Integer.toHexString(0xFF & byteArray[i]).length() == 1)
                md5StrBuff.append("0").append(
                        Integer.toHexString(0xFF & byteArray[i]));
            else {
                md5StrBuff.append(Integer.toHexString(0xFF & byteArray[i]));
            }

        }

        return md5StrBuff.toString();
    }

    public static void main(String[] args) {

        System.out.println("/bc/url/aaa".contains("/url/aaa"));
        for (int i = 0; i < 1000; i++) {
            System.out.println( new Random().nextDouble());
        }
        Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime min = LocalDateTime.of( LocalDateTime.now().toLocalDate(), LocalTime.MIN);
        LocalDateTime max = LocalDateTime.of( LocalDateTime.now().toLocalDate(), LocalTime.MAX);


        System.out.println(JSON.toJSONString(localDateTime.with( LocalTime.MIN)));
        System.out.println(JSON.toJSONString(localDateTime.with( LocalTime.MAX)));
        //System.err.println(MD5Utils.getMD5Str("JT583594"));//
        System.err.println(MD5Utils.getMD5Str("123456abc"));//df10ef8509dc176d733d59549e7dbfaf
        System.err.println(MD5Utils.getMD5Str("JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111091JT00001111084JT00001111095JT00001111096JT00001111097JT00001111098JT00001111099"));
        System.out.println("d9627a7998af89e273fa105a8e78025b".length());

    }
}
