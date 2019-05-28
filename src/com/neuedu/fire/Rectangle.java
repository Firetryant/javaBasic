package com.neuedu.fire;

public class Rectangle {
    private int width=1; private  int height=1;
    public  void setWidth(int width1){width=width1;}
    public int getWidth(){return width; }
    public  void  setHeight(int height1){height=height1;}
    public  int getHeight(){ return  height;}
    public   String toString(){return  "宽"+width+"高"+height;}
  //  int width=1;  int height=1;
    public  void zh(){
        int reslut=(width+height)*2;
        System.out.println(reslut);}
    public void  zh(int width1){
        width=width1;
        int reslut =(width+height)*2;
         System.out.println(reslut);
    }
    public void  zh(int width1, int height1){
width=width1;     height=height1;
        int reslut =(width+height)*2;
          System.out.println(reslut);}


    public  void  area(){ int  reslut =width*height;}
    public  void  area(int width1){
        width1=width1;     int  reslut =width*height;
         System.out.println(reslut);}
    public  void  area(int width1,int height1){
     width=width1;   height=height1;     int  reslut =width*height;
      System.out.println(reslut);}
    public  void  pint_res(){
        System.out.println();
    }

}
