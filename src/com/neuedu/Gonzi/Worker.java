package com.neuedu.Gonzi;

public class Worker extends Person
{
     private int dayNum;  private int salary;

    public int getDayNum() {
        return dayNum;
    }

    public void setDayNum(int dayNum) {
        this.dayNum = dayNum;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
    this.salary = salary;
}
public void  computeSalary(){System.out.println("工人的工资为："+dayNum+salary);}
//强制重写方法 重写Person父类的方法  子类对父类方法的重新实现
/*@Overriad
    public  void  computeSalary(){System.out.println("工人的工资为："+dayNum*salary);};*/
/*   public void setDayNum(int dayNum) {
    this.dayNum = dayNum;
}
public  int getSalary(){return salary;}*/
}
