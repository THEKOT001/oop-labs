package com.company;

public class E extends D{
    protected String e;

    E(String A1, X X1) {
        super(A1, X1);
        e = A1;
    }

    @Override
    public String toString() {
        return "E{" +
                "e='" + e + '\'' +
                "}\n" + super.toString();
    }
}