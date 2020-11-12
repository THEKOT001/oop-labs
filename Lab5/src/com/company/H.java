package com.company;

public class H extends G{
    protected String h;
    private final X x = new X("xhxhxhxh");

    H(String A1, X X1) {
        super(A1, X1);
        h = A1;
    }

    @Override
    public String toString() {
        return "H{" +
                "h='" + h + "'|"  + x.toString() +
                "}\n" + super.toString();
    }
}
