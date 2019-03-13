package com.designpattern.structuralpattern.DemoTest;


import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Configuration
@interface MainBean {

    @AliasFor("value")
    String beanName() default "";
    @AliasFor("beanName")
    String value() default "";
}