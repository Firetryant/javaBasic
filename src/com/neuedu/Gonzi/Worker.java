package com.neuedu.Gonzi;
//继承的练习   extends  简化代码 将多个重复的属性写在一个共有的类中作为父类可用来继承
public class Worker extends Person
{
     private int dayNum;  private int salary;

    public int getDayNum() {
        return dayNum;
    }

    public void setDayNum(int dayNum) {
        this.dayNum = dayNum;
        System.out.println(dayNum);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
    this.salary = salary;
        System.out.println(salary);
}
  //  public  String toString(){return getDate()+getName()+getSex()+getHeight()+getWidth();};
public void  computeSalary(){System.out.println("工人的工资为："+dayNum*salary);}
//强制重写方法 重写Person父类的方法  子类对父类方法的重新实现
/*@Overriad
    public  void  computeSalary(){System.out.println("工人的工资为："+dayNum*salary);};*/
/*   public void setDayNum(int dayNum) {
    this.dayNum = dayNum;
}
public  int getSalary(){return salary;}*/
}
