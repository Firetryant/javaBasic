package com.neuedu.Gonzi;
//继承的练习   extends  简化代码 将多个重复的属性写在一个共有的类中作为父类可用来继承
public abstract class   Person {
   private String name;
   private String sex;
   private String date;
   private int height;
   private int width;
   private int arge;
   private  String ZHIYE;

    public String getZHIYE() {
        return ZHIYE;
    }

    public void setZHIYE(String ZHIYE) {
        this.ZHIYE = ZHIYE;
        System.out.println("职位"+ZHIYE);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
        System.out.println("身高"+height);
    }

    public int getArge() {
        return arge;
    }

    public void setArge(int arge) {
        this.arge = arge;
        System.out.println("年龄"+arge);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
        System.out.println("体重"+width);
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
        System.out.println("姓名"+name);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        System.out.println("性别"+sex);
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
        System.out.println("日期"+date);
    }
//public void  computeSalary(){System.out.println ("工资");};
//抽象方法的应用 关键词  abstract 抽象类中不一定有抽象方法但 抽象方法必须写在抽象类中  只有方法的生成没有方法体
    public abstract void computeSalary();



   /* @Override
    public String toString() {
        return super.toString();
    }*/
}
