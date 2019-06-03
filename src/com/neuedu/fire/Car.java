package com.neuedu.fire;

public class Car {
   private String mark;   private int price;  private int speed;

    public void setMark(String mark1) {
        mark=mark1;
    }
    public String getMark(){return mark;}
    public  void setPrice(int price1){price=price1;}
    public  int getPrice(){return price;}
    public  void  setSpeed(int speed1){speed=speed1;}
    public int getSpeed(){return speed;}
    public String toString(){return "品牌:"+mark+"价格$"+price+"速度MAX:"+speed;}

    public void Drive(){}
    public void speedChane(int speed1){speed=speed1;}





















}
