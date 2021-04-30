/*
package com.security;


import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.codec.digest.HmacUtils;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SecurityTest {

    public static void main(String[] args) {

    }

    */
/**
     * 1.完全开放的接口（完全开放）
     *//*

    public void test1(){
        ReturnObject returnObject = new ReturnObject();
        returnObject.setErrorCode(0);
        returnObject.setErrorMessage("操作成功");
    }

    */
/**
     * 2.接口参数签名（基础安全）
     *//*

    public void test2(){
        String sign = "";
        ReturnObject returnObject = new ReturnObject();

        Map<String, Object> signMap = new ConcurrentHashMap<String, Object>();
        signMap.put("idCard", "idCard");
        signMap.put("realName", "realName");
        signMap.put("phone", "phone");
        signMap.put("bankCard", "bankCard");

        //1、将请求参数按字典顺序排列，参数之间以&相连，形成idCard=110231197709092352&realName=张三丰
        String sortParams = SignUtil.getSortParams(signMap, "SECRETKEY");

        //2、采用双方约定好的盐值（一个字符串密钥）对排序好的请求参数进行MD5签名
        //String serverSign = DigestUtils.md5Hex(sortParams);
        String serverSign = new String(HmacUtils.hmacMd5Hex("SECRETKEY", sortParams));

        //3、进行签名验证，比较调用方传过来的sign和服务方生成的serverSign是否一致
        boolean validator = SignUtil.signValidator(sign, serverSign);

        System.out.println("客户端签名：" + sign);
        System.out.println("服务端签名：" + serverSign);
        if (validator) {
            //签名通过
            returnObject.setErrorCode(0);
            returnObject.setErrorMessage("签名验证通过");
            returnObject.setData(signMap);
        } else {
            //验证签名不通过
            returnObject.setErrorCode(1);
            returnObject.setErrorMessage("签名验证不通过");
        }
    }
    public void test3(){
        String sign = null;
        ReturnObject returnObject = new ReturnObject();

        Map<String, Object> signMap = new ConcurrentHashMap<String, Object>();
        signMap.put("idCard", "idCard");
        signMap.put("realName", "realName");
        signMap.put("phone", "phone");
        signMap.put("bankCard", "bankCard");
        signMap.put("timestamp", "timestamp");

        //1、验证时间戳是否已经过期
        boolean timestampValidator = SignUtil.timestampValidator(signMap.get("timestamp").toString());

        if (!timestampValidator) {
            returnObject.setErrorCode(1);
            returnObject.setErrorMessage("时间戳过期");
        }

        //2、将请求参数按字典顺序排列，参数之间以&相连，形成idCard=110231197709092352&realName=张三丰
        String sortParams = SignUtil.getSortParams(signMap, "SECRETKEY");

        //3、采用双方约定好的盐值（一个字符串密钥）对排序好的请求参数进行MD5签名
        String serverSign = DigestUtils.md5Hex(sortParams);

        //4、进行签名验证，比较调用方传过来的sign和服务方生成的serverSign是否一致
        boolean validator = SignUtil.signValidator(sign, serverSign);

        //签名验证
        if (validator) {
            //签名通过
            returnObject.setErrorCode(0);
            returnObject.setErrorMessage("签名验证通过");
            returnObject.setData(signMap);
        } else {
            //验证签名不通过
            returnObject.setErrorCode(1);
            returnObject.setErrorMessage("签名验证不通过");
        }
    }
    public void test4(){
        ReturnObject returnObject = new ReturnObject();
        String sign = null;
        Map<String, Object> signMap = new ConcurrentHashMap<String, Object>();
        signMap.put("idCard", "idCard");
        signMap.put("realName", "realName");
        signMap.put("phone", "phone");
        signMap.put("bankCard", "bankCard");
        signMap.put("timestamp", "timestamp");

        //1、将请求参数按字典顺序排列，参数之间以&相连，形成idCard=110231197709092352&realName=张三丰
        String paramsStr = SignUtil.getSortParams(signMap, "SECRETKEY");

        //2、验证公钥签名的串是否是正确
        boolean flag = RSAUtils.doCheck(paramsStr, sign, "CLIENT_PUBLIC_KEY");
        System.out.println("-->公钥验签结果：" + flag);

        Map<String, Object> responseParameterMap = new ConcurrentHashMap<String, Object>();
        if (flag) {
            //签名通过，准备数据返回给调用者
            responseParameterMap.put("errorCode", "0");
            responseParameterMap.put("timestamp", String.valueOf(System.currentTimeMillis()));

            returnObject.setErrorCode(0);
            returnObject.setErrorMessage("签名验证通过");
        } else {
            //验证签名不通过，准备数据返回给调用者
            responseParameterMap.put("errorCode", "0");
            responseParameterMap.put("timestamp", String.valueOf(System.currentTimeMillis()));

            returnObject.setErrorCode(1);
            returnObject.setErrorMessage("签名验证不通过");
        }
        String sortParams = SignUtil.getSortParams(responseParameterMap, "SECRETKEY");
        String serverSign = RSAUtils.sign(sortParams, "SERVER_PRIVATE_KEY");
        responseParameterMap.put("sign", serverSign);
        returnObject.setData(responseParameterMap);

    }
}
*/
