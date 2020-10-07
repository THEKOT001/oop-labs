package com.oop;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Monitor monitor1 =new Monitor();
        monitor1.color = "Black";
        System.out.println("Color = "+monitor1.color);
        monitor1.dimension[0]=200;
        monitor1.dimension[1]=150;
        monitor1.dimension[2]=50;
        monitor1.resolution[0]=1680;
        monitor1.resolution[1]=1050;
        System.out.println("Monitor1 proprietes");
        System.out.println("======================================================");
        System.out.println("Color = "+monitor1.color);
        System.out.println("Resolution = "+monitor1.resolution[0]+ " X " +monitor1.resolution[1] + "Pixels");
        System.out.println("Dimensions = "+monitor1.dimension[0]+ " X " +monitor1.dimension[1]+ " X "+monitor1.dimension[2] + " mm");
        System.out.println("*************************");



        Monitor monitor2 =new Monitor();
        monitor2.color = "Black";
        monitor2.dimension[0]=300;
        monitor2.dimension[1]=250;
        monitor2.dimension[2]=100;
        monitor2.resolution[0]=1680;
        monitor2.resolution[1]=1050;
        System.out.println("Monitor2 proprietes");
        System.out.println("======================================================");
        System.out.println("Color = "+monitor2.color);
        System.out.println("Resolution = "+monitor2.resolution[0]+ " X " +monitor2.resolution[1] + "Pixels");
        System.out.println("Dimensions = "+monitor2.dimension[0]+ " X " +monitor2.dimension[1]+ " X "+monitor2.dimension[2] + " mm");

                if(monitor1.color==monitor2.color &&
                        monitor1.dimension[0]==monitor2.dimension[0]&&
                        monitor1.dimension[1]==monitor2.dimension[1]&&
                        monitor1.dimension[2]==monitor2.dimension[2]&&
                        monitor1.resolution[0]==monitor2.resolution[0]&&
                        monitor1.resolution[1]==monitor2.resolution[1]){
                    System.out.println("Monitors are equal");
                }else{
                    System.out.println("Monitors are not equal");
                }
    }
}
