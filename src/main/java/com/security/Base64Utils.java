package com.security;

import org.apache.commons.codec.binary.Base64;

/**
 * base64操作
 * 
 * @author yanglijun
 *
 */
public class Base64Utils {

	public static void main(String[] args) {
		System.out.println();

        System.out.println("reset 2");
	}

	/**
	 * BASE64字符串解码为二进制数据
	 * 
	 * @param base64
	 * @return
	 * @throws Exception
	 */
	public static byte[] decode(String base64) {
		return new Base64().decode(base64);
	}

	/**
	 * 二进制数据编码为BASE64字符串
	 * 
	 * @param bytes
	 * @return
	 * @throws Exception
	 */
	public static String encode(byte[] bytes) {
		return new Base64().encodeToString(bytes);
	}
}