package com.neuedu.fire;


//import java.util.Scanner;

import java.util.Scanner;

public class Circletest {
    public static void main(String[] args) {
       /* circle circle= new circle();
        System.out.println("输入圆的半径");
        Scanner input =new Scanner(System.in);
        int radius= input.nextInt();
        circle.setRedues(radius);
        double result =circle.zc();
        System.out.println("周长="+result);*/
        //System.out.println(circle.zc());

      /*  System.out.println("面积="+ circle.mianji());*/

      /*  循环输入Scanner input =new Scanner(System.in);
        for (int i=0;i<6;i++){
            int radius= input.nextInt();
            System.out.println(radius);
        }*/


        circle circle= new circle();
        System.out.println("输入圆的半径");
        Scanner input =new Scanner(System.in);
       //死循环 for (;;){
        for (int i=0;i<369;i++){
        int radius= input.nextInt();
        circle.setRedues(radius);
        double result =circle.zc();
        System.out.println("周长="+result);
        //System.out.println(circle.zc());

        System.out.println("面积="+ circle.mianji());

    }}
}
