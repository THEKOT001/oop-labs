package com.oop;

import java.util.Stack;


public class Main {

    public static void main(String[] args) {
	// Box part code
        int a = 0,b = 0 ,c = 0;
        Box box1 =new Box();
        Box box2=new Box(a);
        Box box3=new Box(a,b,c);
//        System.out.println("Area of box= "+box3.calcArea());
//        System.out.println("Volume of box "+box3.calcVolume());

        Stack<Integer> queue1 = new Stack<>();
        Stack<Integer> queue2 = new Stack<>();

//        Queue queue1 =new Queue();
//        Queue queue2 =new Queue(a);
        queue1.push(1);
        queue1.push(1);
        queue1.push(2);
        queue1.push(4);
//        int last1=queue1.pop();
//        System.out.println(last1);

        int last1=queue1.lastElement();
        System.out.println(last1);


        //Second queue
        queue2.push(5);
        queue2.push(5);
        queue2.push(6);
        queue2.push(8);

//        int last2=queue2.pop();
//        System.out.println(last2);

        int last2=queue2.lastElement();
        System.out.println(last2);
    }
}
