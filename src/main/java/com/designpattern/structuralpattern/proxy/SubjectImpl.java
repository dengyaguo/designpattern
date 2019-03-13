package com.designpattern.structuralpattern.proxy;

public class SubjectImpl  implements Subject {
    @Override
    public void request() {
        System.out.println( " From real subject. " );
    }
}
