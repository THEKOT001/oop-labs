package com.oop;


import java.util.Stack;


public class Main {

    public static void main(String[] args) {
                // Box part code
        int a = 1,b = 4 ,c = 3;
        Box box1 =new Box();
        Box box2=new Box(a);
        Box box3=new Box(a,b,c);
        System.out.println("Area of box= "+box3.calcArea());
        System.out.println("Volume of box "+box3.calcVolume());
        //Queue part code
        int i=3;

        Queue queue1 = new Queue();
        queue1.push(1);
        queue1.push(4);
        queue1.push(6);
        System.out.println(queue1.pop());
        System.out.println(queue1.pop());
        System.out.println(queue1.pop());
        System.out.println("Queue1 is:");
        queue1.empty();

        Queue queue2 = new Queue(i);
        queue2.push(6);
        queue2.push(9);
        queue2.push(3);
        queue2.full();
        System.out.println(queue2.pop());
        System.out.println(queue2.pop());
        System.out.println(queue2.pop());
        queue2.push(2);
        System.out.println(queue2.pop());
        System.out.println("Queue 2 is:");
        queue2.full();
        queue2.empty();
    }
}
