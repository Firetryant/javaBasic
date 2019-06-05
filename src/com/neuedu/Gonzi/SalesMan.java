package com.neuedu.Gonzi;

public class SalesMan extends Person{
  private   int basic; private int ticheng;
    public  void  setBasic(int basic){
        this.basic=basic;
    }
    public  int getBasic(){return basic;}
    public  void  setTicheng(int ticheng){
        this.ticheng=ticheng;
    }
    public  int getTicheng(){return ticheng;}
    public void  computeSalary(){System.out.println(  "销售人员工资为:" + basic + ticheng);

    }

}
