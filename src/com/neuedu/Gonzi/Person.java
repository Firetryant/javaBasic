package com.neuedu.Gonzi;

public class Person {
    String name;  String sex; String date;
   private int height; private int width; private int arge;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
public void  computeSalary(){System.out.println("GONZI");};
    //public abstract void computeSalary（）；
    //抽象方法的应用 关键词  abstract 抽象类中不一定有抽象方法但 抽象方法必须写在抽象类中  只有方法的生成没有方法体

   /* @Override
    public String toString() {
        return super.toString();
    }*/
}
