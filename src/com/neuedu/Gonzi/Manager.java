package com.neuedu.Gonzi;
//继承的练习   extends  简化代码 将多个重复的属性写在一个共有的类中作为父类可用来继承
public class Manager extends Person{
   private int salary;
   public  void  setSalary(int salary){this.salary=salary;
   //System.out.println("CEO工资为"+salary);
   }
   public  int getSalary(){return  salary;}
//抽象方法  强制重写父类方法
  @Override
   public void computeSalary() {
      System.out.println("CEO工资为"+salary);

   }
 /*  public void  computeSalary(){
      System.out.println("经理工资为："+salary);
   }  手动写也可以抽象方法强制重写*/
}
