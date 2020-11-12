package com.company;

public class B extends A {
    protected String b;

    B(String A1, X X1) {
        super(A1, X1);
        b = A1;
    }

    public String toString() {
        return "B{" +
                "b='" + b + '\'' +
                "}\n" + super.toString();
    }
}