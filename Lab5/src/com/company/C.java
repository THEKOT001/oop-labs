package com.company;
public class C extends B{
    protected String c;

    C(String A1, X X1) {
        super(A1, X1);
        c = A1;
    }

    @Override
    public String toString() {
        return "C{" +
                "c='" + c + '\'' +
                "}\n" + super.toString();
    }
}
