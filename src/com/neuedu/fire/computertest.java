package com.neuedu.fire;

import java.util.Scanner;

public class computertest {
    public static void main(String[] args) {


   Computer computer =new Computer();
        System.out.println("输入计算的数");
        Scanner input =new Scanner(System.in);
       int a= input.nextInt();
       int b=input.nextInt();
      computer.setA(5);
      computer.setB(6);


  /* computer.jian();
   computer.chen();
   computer.chu();
   computer.add();*/
System.out.println(computer);


    }
}
