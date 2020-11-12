package com.company;


public class A {
    protected String a;
    protected X x = new X("xxx");
    A(String A1, X X1){
        a = A1;
        x = X1;
    }

    @Override
    public String toString() {
        return "A{" +
                "a='" + a + "'|" + x.toString() +
                '}';
    }
}