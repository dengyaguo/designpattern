package com.basejava;

import com.alibaba.fastjson.JSON;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.time.*;
import java.util.Date;

public class MD5Utils {

    private static final String MD5 = "MD5";


    public static String getMD5Str(String str) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance(MD5);

            messageDigest.reset();

            messageDigest.update(str.getBytes("UTF-8"));

        } catch (NoSuchAlgorithmException e) {
            System.out.println("NoSuchAlgorithmException caught!");
            e.printStackTrace();
            System.exit(-1);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
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
        Date date = new Date();
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(date.getTime()), ZoneId.systemDefault());
        LocalDateTime min = LocalDateTime.of( LocalDateTime.now().toLocalDate(), LocalTime.MIN);
        LocalDateTime max = LocalDateTime.of( LocalDateTime.now().toLocalDate(), LocalTime.MAX);


        System.out.println(JSON.toJSONString(localDateTime.with( LocalTime.MIN)));
        System.out.println(JSON.toJSONString(localDateTime.with( LocalTime.MAX)));
        System.err.println(MD5Utils.getMD5Str("aa123456"));
    }

}
