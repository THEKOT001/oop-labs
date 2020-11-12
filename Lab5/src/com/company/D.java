package com.company;

public class D extends C{
    protected String d;
    protected X x = new X("xdxdxdxddx");

    D(String A1  , X X1   ) {
        super(A1, X1);
        d = A1;
    }

    @Override
    public String toString() {
        return "D{" +
                "d='" + d + "'|"  + x.toString() +
                "}\n" + super.toString();
    }
}