package com.neuedu.fire;

import java.util.Scanner;

public class computertest {
    public static void main(String[] args) {


   Computer computer =new Computer();
        System.out.println("输入计算的数");
        Scanner input =new Scanner(System.in);
       int a= input.nextInt();
       int b=input.nextInt();
       computer.getA();


   computer.jian(45,589);
   computer.chen(2,2);
   computer.chu(5,4);
   computer.add(45847,62454);
  // System.out.println();


    }
}
