package com.neuedu.Gonzi;

public class Test {
    public static void main(String[] args) {
        Worker W=new Worker();W.setName("熊大");W.setSex("man");
      W.setHeight(180);
      W.setDate("6.1");
      W.setDayNum(30);
      W.setSalary(199);
      W.setArge(27);
      W.computeSalary();


         SalesMan salesMan=new SalesMan();
      salesMan.setBasic(3000);
      salesMan.setTicheng(2700);
      salesMan.setName("Lisa");
      salesMan.setSex("woman");
      salesMan.setArge(21);
      salesMan.setDate("5.2");
      salesMan.setHeight(170);
      salesMan.setWidth(60);
      salesMan.computeSalary();

       Manager manager =new Manager();
       manager.setZHIYE("CEO");
       manager.setName(" Fire");
       manager.setSex("man");
       manager.setArge(36);
       manager.setDate("3.6");
       manager.setHeight(176);
       manager.setWidth(70);
       manager.setSalary(999999999);
       manager.computeSalary();



            }
}
