package com.neuedu.fire;

public class Pointtest {
    public static void main(String[] args) {
        Point p1 =new Point();
        p1.movePoint(5,7);
        System.out.println(p1);
        Point p2=new Point(0,0);
        p2.movePoint(-2,-6);
        System.out.println(p2);



    }
}
