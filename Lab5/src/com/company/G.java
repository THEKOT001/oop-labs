package com.company;

public class G extends F{
    protected String g;

    G(String A1, X X1) {
        super(A1, X1);
        g = A1;
    }

    @Override
    public String toString() {
        return "G{" +
                "g='" + g + '\'' +
                "}\n" + super.toString();
    }
}
