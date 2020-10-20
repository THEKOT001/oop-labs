package com.oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        TextParser textParser =new TextParser();
        String a=textParser.readFile();
//        String a="2x - 3y + 25 / (-((29*4-2) + 32) -14 - (2+5)*12)";
        BalancedParan text = new BalancedParan(a);
//        System.out.println(a);
        if(text.read()){
            System.out.println(a+"Main");
        }
        else{
            System.out.println("Somthing went wrong ");
        }
    }
}

