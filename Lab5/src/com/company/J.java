package com.company;

public class J extends I{
    protected String j;

    J(String A1, X X1) {
        super(A1, X1);
        j = A1;
    }

    @Override
    public String toString() {
        return "J{" +
                "j='" + super.b + '\'' +
                "}\n" + super.toString();
    }
}