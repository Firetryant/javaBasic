package com.neuedu.Gonzi;
//继承的练习   extends  简化代码 将多个重复的属性写在一个共有的类中作为父类可用来继承
public class SalesMan extends Person{
  private   int basic; private int ticheng;
    public  void  setBasic(int basic){
        this.basic=basic;
      System.out.println("底薪"+basic);
    }
    public  int getBasic(){return basic;}
    public  void  setTicheng(int ticheng){
        this.ticheng=ticheng;
      System.out.println("提成"+ticheng);
    }
    public  int getTicheng(){return ticheng;}
    public void  computeSalary(){System.out.println(  "销售人员工资为:"+ (basic +ticheng));

    }

}
