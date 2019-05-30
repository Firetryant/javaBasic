package com.neuedu.fire;

public class circle {

   private int redues;
    public void  setRedues(int redues1){
       if (redues1<0){System.out.println("半径不能为负数，你这是在为难我胖虎！！！");}
    else {redues=redues1;}}
    public  int  getRedues(){return redues;}
    public  double zc (){ return Math.PI*redues*2;}

    public  double mianji(){  return  Math.PI*redues*redues;}
// public  double arer(){ return  Math.PI*Math.pow(redues,2);}

}
