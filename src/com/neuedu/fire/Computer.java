package com.neuedu.fire;

public class Computer {
   private int a=1;
    private int b=1;
    public void setA(int a1){
    if (a<0){  System.out.println("值不为负数"); }
    else {a=a1;}
    }
    public int getA(){return a;}
    public  void setB(int b1){b=b1;}

    private int getB(){return b;}
   public String toString() {return "输入的第一个值是"+a+"   输入的第二个值是"+b ; }
    public  void add(){};
    public  void add(int a ,int b){
      // a=a1;b=b1;
        int reslut=a+b;
   System.out.println(reslut);
    }
    public  void  jian(){};
    public  void jian(int a ,int b){
        // a=a1;b=b1;
        int reslut=a-b;
        System.out.println(reslut);
    }
    public  void  chen(){};
    public  void chen(int a ,int b){
        // a=a1;b=b1;
        int reslut=a*b;
        System.out.println(reslut);
    }
    public  void  chu(){};
    public  void  chu(int a ,int b){
        // a=a1;b=b1;
        int reslut=a/b;
        System.out.println(reslut);
    }
   // public void printin_com(){System.out.println("计算结果为：");}


}
