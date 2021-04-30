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
     * 1.��ȫ���ŵĽӿڣ���ȫ���ţ�
     *//*

    public void test1(){
        ReturnObject returnObject = new ReturnObject();
        returnObject.setErrorCode(0);
        returnObject.setErrorMessage("�����ɹ�");
    }

    */
/**
     * 2.�ӿڲ���ǩ����������ȫ��
     *//*

    public void test2(){
        String sign = "";
        ReturnObject returnObject = new ReturnObject();

        Map<String, Object> signMap = new ConcurrentHashMap<String, Object>();
        signMap.put("idCard", "idCard");
        signMap.put("realName", "realName");
        signMap.put("phone", "phone");
        signMap.put("bankCard", "bankCard");

        //1��������������ֵ�˳�����У�����֮����&�������γ�idCard=110231197709092352&realName=������
        String sortParams = SignUtil.getSortParams(signMap, "SECRETKEY");

        //2������˫��Լ���õ���ֵ��һ���ַ�����Կ��������õ������������MD5ǩ��
        //String serverSign = DigestUtils.md5Hex(sortParams);
        String serverSign = new String(HmacUtils.hmacMd5Hex("SECRETKEY", sortParams));

        //3������ǩ����֤���Ƚϵ��÷���������sign�ͷ������ɵ�serverSign�Ƿ�һ��
        boolean validator = SignUtil.signValidator(sign, serverSign);

        System.out.println("�ͻ���ǩ����" + sign);
        System.out.println("�����ǩ����" + serverSign);
        if (validator) {
            //ǩ��ͨ��
            returnObject.setErrorCode(0);
            returnObject.setErrorMessage("ǩ����֤ͨ��");
            returnObject.setData(signMap);
        } else {
            //��֤ǩ����ͨ��
            returnObject.setErrorCode(1);
            returnObject.setErrorMessage("ǩ����֤��ͨ��");
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

        //1����֤ʱ����Ƿ��Ѿ�����
        boolean timestampValidator = SignUtil.timestampValidator(signMap.get("timestamp").toString());

        if (!timestampValidator) {
            returnObject.setErrorCode(1);
            returnObject.setErrorMessage("ʱ�������");
        }

        //2��������������ֵ�˳�����У�����֮����&�������γ�idCard=110231197709092352&realName=������
        String sortParams = SignUtil.getSortParams(signMap, "SECRETKEY");

        //3������˫��Լ���õ���ֵ��һ���ַ�����Կ��������õ������������MD5ǩ��
        String serverSign = DigestUtils.md5Hex(sortParams);

        //4������ǩ����֤���Ƚϵ��÷���������sign�ͷ������ɵ�serverSign�Ƿ�һ��
        boolean validator = SignUtil.signValidator(sign, serverSign);

        //ǩ����֤
        if (validator) {
            //ǩ��ͨ��
            returnObject.setErrorCode(0);
            returnObject.setErrorMessage("ǩ����֤ͨ��");
            returnObject.setData(signMap);
        } else {
            //��֤ǩ����ͨ��
            returnObject.setErrorCode(1);
            returnObject.setErrorMessage("ǩ����֤��ͨ��");
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

        //1��������������ֵ�˳�����У�����֮����&�������γ�idCard=110231197709092352&realName=������
        String paramsStr = SignUtil.getSortParams(signMap, "SECRETKEY");

        //2����֤��Կǩ���Ĵ��Ƿ�����ȷ
        boolean flag = RSAUtils.doCheck(paramsStr, sign, "CLIENT_PUBLIC_KEY");
        System.out.println("-->��Կ��ǩ�����" + flag);

        Map<String, Object> responseParameterMap = new ConcurrentHashMap<String, Object>();
        if (flag) {
            //ǩ��ͨ����׼�����ݷ��ظ�������
            responseParameterMap.put("errorCode", "0");
            responseParameterMap.put("timestamp", String.valueOf(System.currentTimeMillis()));

            returnObject.setErrorCode(0);
            returnObject.setErrorMessage("ǩ����֤ͨ��");
        } else {
            //��֤ǩ����ͨ����׼�����ݷ��ظ�������
            responseParameterMap.put("errorCode", "0");
            responseParameterMap.put("timestamp", String.valueOf(System.currentTimeMillis()));

            returnObject.setErrorCode(1);
            returnObject.setErrorMessage("ǩ����֤��ͨ��");
        }
        String sortParams = SignUtil.getSortParams(responseParameterMap, "SECRETKEY");
        String serverSign = RSAUtils.sign(sortParams, "SERVER_PRIVATE_KEY");
        responseParameterMap.put("sign", serverSign);
        returnObject.setData(responseParameterMap);

    }
}
*/
