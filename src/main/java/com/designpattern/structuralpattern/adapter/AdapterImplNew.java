package com.designpattern.structuralpattern.adapter;

import org.springframework.context.annotation.Scope;

@Scope
public class AdapterImplNew extends AbstractAdapter {
    @Override
    public void methodNew(){
        System.out.println("this is new method");
    };
}
