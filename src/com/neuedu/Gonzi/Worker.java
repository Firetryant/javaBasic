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
//this()可以调用当前类的构造方法，  super（）调用父类的构造方法  两者必须写在构造方法的第一行  两者不能一起用
    //一次构造方法将父类子类的值全赋上借助super（） 父类也的有构造方法
public  Worker(int dayNum,int salary,String name,String sex,String date, int height, int width, int arge, String ZHIYE){
        super(name,sex,date,height,width,arge,ZHIYE);
        this.dayNum=dayNum;
        this.salary=salary;

}
//强制重写方法 重写Person父类的方法  子类对父类方法的重新实现
/*@Overriad
    public  void  computeSalary(){System.out.println("工人的工资为："+dayNum*salary);};*/
/*   public void setDayNum(int dayNum) {
    this.dayNum = dayNum;
}
public  int getSalary(){return salary;}*/
}
