package com.neuedu.fire;

import java.util.Scanner;

public class computertest {
    public static void main(String[] args) {


   Computer computer =new Computer();
        System.out.println("输入计算的数");
        Scanner input =new Scanner(System.in);
        //套入一个死循环
    for (;;) {
        //计算设置的次数369次
       //for (int i=0;i<369;i++){
            System.out.println("第一个数值a，默认为1");
            int a = input.nextInt();
            computer.setA(a);
            System.out.println("第二个数值，默认为1");
            int b = input.nextInt();
            computer.setB(b);
            System.out.println(computer);

            System.out.println("两数之和为");
            computer.add(a, b);
            System.out.println("两数之差为");
            computer.jian(a, b);
            System.out.println("两数之积为");
            computer.chen(a, b);
            System.out.println("两数的商为");
            computer.chu(a, b);


        } }
}
