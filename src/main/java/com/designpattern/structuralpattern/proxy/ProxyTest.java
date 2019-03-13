package com.designpattern.structuralpattern.proxy;

import org.junit.Test;
import org.springframework.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 *  测试类
 * 为其他对象提供一种代理以控制对这个对象的访问
 */
public class ProxyTest {
    public static void main(String[] args) {

        //动态代理
        SubjectImpl subjectImpl = new SubjectImpl();
        InvocationHandler ih = new DynamicSubject(subjectImpl);
        Subject subject = (Subject) Proxy.newProxyInstance(ProxyTest.class.getClassLoader(), subjectImpl.getClass().getInterfaces(),ih );
        System.out.println(subject.getClass().getSimpleName());
        subject.request();
    }

    //CGLIB(Code Generation Library)是一个开源项目
    @Test
    public void testDynamicProxy() {
        DaoProxy daoProxy = new DaoProxy();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Dao.class);
        enhancer.setCallback(daoProxy);
        Dao dao = (Dao)enhancer.create();
        dao.update();
        dao.select();
    }
}
