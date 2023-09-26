package com.company;

public class Array {
    public static void main(String[] args) {

    String[] a=new String[3];
    String s="";
    int y=0;
    for(int i=1;i<6;i=i+2){
        for(int j=1;j<=i;j++){
            s=s+"*";
        }
        a[y]=s;
        y++;
        s="";
    }
    for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
    }
}
}
