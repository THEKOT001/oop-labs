package com.oop;

import java.util.ArrayList;

public class Queue {
    Integer maxsize;
    private ArrayList<Integer> unlimitedlist;
    private int[] limitedlist;
    private int lastindex=0;

    public Queue(){
        this.unlimitedlist=new ArrayList<>();
    }

    public Queue(int size){
        this.limitedlist = new int[size];
    }

    public void push (int i){
        if (limitedlist != null && limitedlist.length > lastindex){
            if(limitedlist.length > lastindex){
                limitedlist[lastindex]=i;
                lastindex=lastindex+1;
            }
            else{
                System.out.println("Queue is full");
            }
        }else{
            unlimitedlist.add(i);
            lastindex=lastindex+1;
        }
    }

    public int pop (){
        int t=0;
        if (lastindex==0){
            System.out.println("Queue is empty");
        }
        if (limitedlist != null && lastindex != 0){
            t = limitedlist[0];
            lastindex=lastindex-1;
            for(int i =0;i<limitedlist.length -1;i++){
                limitedlist[i]=limitedlist[i+1];
            }
        }
        if (unlimitedlist!=null && lastindex!=0){
            t=unlimitedlist.get(0);
            lastindex=lastindex-1;
            for(int i=0;i<unlimitedlist.size()-1;i++){
                unlimitedlist.set(i,unlimitedlist.get(i+1));
            }
        }
        return t;
    }
    public void empty(){
        if (unlimitedlist!=null && lastindex==0){
            System.out.println("Queue is empty");
        }else if (lastindex == 0) {
            System.out.println("Queue is Empty");
        }
    }
    public void full(){
        if(limitedlist != null && limitedlist.length == lastindex){
            System.out.println("Queue is full");
        }
    }

}
