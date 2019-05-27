package com.neuedu.fire;

public class text_class {
    public static void main(String[] args) {
       /* System.out.println("hello word " + "FIRE IS COMMING");
        int a = 4;
        if (a >= 42) {
            System.out.println("a为良品");
        } else if (a < 42) {
            System.out.println("a为残次品");
        }
        else{ System.out.println("a为优品");}
*/
   // 冒泡排序
       int[]arrs={1,2,5,4,78,96,8,85,};
System.out.println(arrs[5]);
    for (int i=0;i<=arrs.length-1;i++){for (int j=0; j<arrs.length-1-i;j++){if (arrs[j]>arrs[j+1]){int tmp=0;
        tmp=arrs[j]; arrs[j]=arrs[j+1] ; arrs[j+1]=tmp;}}}
        for (int i=0; i< arrs.length;i++){System.out.println(arrs[i]);{System.out.println(arrs[i]);}}

    }
}

