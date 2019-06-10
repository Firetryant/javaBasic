package com.neuedu.Gonzi;

public class Test {
    public static void main(String[] args) {
        //方法一
     /*   Worker W=new Worker();
        W.setName("熊大");
        W.setSex("man");
      W.setHeight(180);
      W.setDate("6.1");
      W.setDayNum(30);
      W.setSalary(199);
      W.setArge(27);
      W.computeSalary();*/
      //构造方法 方法二
        Worker w=new Worker
                (30,3000,"熊大","man","6.1",180,70,27,"员工");
        System.out.println
                ("姓名："+w.getName()+"职位："+w.getZHIYE()+"性别："+w.getSex()+"入职时间："+w.getDate()+"工作天数："+w.getDayNum()+"日薪："+w.getSalary()+"年龄："+w.getArge()+"身高："+w.getHeight()+"体重："+w.getWidth());
        w.computeSalary();
//方法一
        /* SalesMan salesMan=new SalesMan();
      salesMan.setBasic(3000);
      salesMan.setTicheng(2700);
      salesMan.setName("Lisa");
      salesMan.setSex("woman");
      salesMan.setArge(21);
      salesMan.setDate("5.2");
      salesMan.setHeight(170);
      salesMan.setWidth(60);
      salesMan.computeSalary();*/
        //方法二 构造方法赋值打印
        SalesMan salesMan=new SalesMan
                (3000,3000,"Lisa","woman","5.2",170,60,21,"销售");
        System.out.println
                ("姓名："+salesMan.getName()+"职位："+salesMan.getZHIYE()+"性别："+salesMan.getSex()+"入职时间："+salesMan.getDate()+"年龄： "+salesMan.getArge()+"体重："+salesMan.getWidth()+"身高："+salesMan.getHeight()+"提成："+salesMan.getTicheng()+"底薪："+salesMan.getBasic());
        salesMan.computeSalary();
//同上
      /* Manager manager =new Manager();
       manager.setZHIYE("CEO");
       manager.setName(" Fire");
       manager.setSex("man");
       manager.setArge(36);
       manager.setDate("3.6");
       manager.setHeight(176);
       manager.setWidth(70);
       manager.setSalary(999999999);
       manager.computeSalary();*/

      Manager manager=new Manager(999999999,"Fire","man","3.6",36,176,70,"CEO");
      System.out.println("姓名："+manager.getName()+"职位："+manager.getZHIYE()+"性别："+manager.getSex()+"年龄："+manager.getArge()+"入职时间："+manager.getDate()+"身高："+manager.getHeight()+"体重："+manager.getWidth());
      //System.out.println("姓名："+manager.getName()+"职位："+manager.getZHIYE()+"性别："+manager.getSex()+"入职时间："+manager.getDate()+"年龄:"+manager.getArge()+"体重："+manager.getWidth()+"身高："+manager.getHeight());
        manager.computeSalary();
            }
}
