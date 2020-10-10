package com.oop;

public class Box {
    int height;
    int width;
    int depth;
    public Box(){
        this.width=1;
        this.height=1;
        this.depth=1;
    }
    public Box(int a){
        this.width=a;
        this.height=a;
        this.depth=a;
    }
    public Box(int a,int b,int c){
        this.width=a;
        this.height=b;
        this.depth=c;
    }
    public int calcArea(){
        int area = 2*(height*width + width*depth + depth*height);
        return area;
    }
    public int calcVolume(){
        int volume=height*width*depth;
        return volume;

    }


}

