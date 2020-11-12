package com.company;

public class X {
    protected String x;

    X(String x1){
        x = x1;
    }

    @Override
    public String toString() {
        return "X{" +
                "x='" + x + '\'' +
                '}';
    }
}