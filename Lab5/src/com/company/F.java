package com.company;

public class F extends E {
    protected String f;

    F(String A1, X X1) {
        super(A1, X1);
        f = A1;
    }

    @Override
    public String toString() {
        return "F{" +
                "f='" + f + '\'' +
                "}\n" + super.toString();
    }
}