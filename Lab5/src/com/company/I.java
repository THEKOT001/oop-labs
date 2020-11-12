package com.company;

public class I extends H {
    protected String i;

    I(String A1, X X1) {
        super(A1, X1);
        i = A1;
    }

    @Override
    public String toString() {
        return "I{" +
                "i='" + i + '\'' +
                "}\n" + super.toString();
    }
}