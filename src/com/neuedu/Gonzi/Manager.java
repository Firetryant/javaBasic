package com.neuedu.Gonzi;
//继承的练习   extends  简化代码 将多个重复的属性写在一个共有的类中作为父类可用来继承
public class Manager extends Person{
   private int salary;
   public  void  setSalary(int salary){this.salary=salary;}
   public  int getSalary(){return  salary;}
   public void  computeSalary(){};
}
