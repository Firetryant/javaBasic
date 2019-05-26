package com.neuedu.fire;

import java.util.Scanner;

public class fireWork {
public static void main(String[] args) {
//        System.out.println("hello word");
//        int a = 8;
//        if (a < 10) {
//            System.out.println("a不合格");
//        }else if ( a>10){ System.out.println("a为合格品"
//        );}
//        else{
//            System.out.println(
//                    "a为良品");
//        }*/

    /*    int a=0;
        for (int i=100; i<=999;i++){int b=i/100; int s=(i-100*b)/10; int g=(i-s*10-b*100);
            if (i==g*g*g+s*s*s*+b*b*b){a++; System.out.print(i+"");}}
            System.out.println("水仙花有"+a+"个");*/

   /* int i=0; int j=0; int k=0; int t=0; for(i=1; i<=4; i++){for (j=1; j<=4; j++){ for (k=1; k<=4; k++){ if (i !=j&&j!=k&&i!=k){
        t+=1;System.out.println(i*100+j*10+k);}}}}
         System.out.printIn("共能组成"+"个数字");*/
 /*  阶乘
   int i=1*2*3*4*5*6*7*8*9; System.out.println(i);*/
/* 奇数偶数和
 int m=0; int n=0; for (i=o;i<=100;i++){ if (i%2!=0){m=i+n;} else{n=i+n;}}
  System.out.println("奇数和="+n); System.out.println("偶数和"+m );*/

 Scanner input=new Scanner(System.in); int i=input.nextInt(); int a=i/10000; int b=i/1000%10;int c=i/100%10; int d=
         i/10; if (a==a&&b==d){System.out.println(i+"为回文数"); }
         else {System.out.println(i+"不是回文数");}
} }
