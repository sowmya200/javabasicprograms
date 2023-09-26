package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
//a database setup where each one will be assigned with a unique rollno
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter employee details");
        char ones='a',tens='a',h='a';
        int u=0;
        String accep=sc.next();
        int accept=100;
        while(u==0){ System.out.println("sss-"+h+tens+ones+"-"+accept);
            // if(ones>='A'&&ones<='z'){
            if(ones=='z'&&tens!='z'){
                tens++;
                accep= sc.next();}
            else if(tens=='z'&&ones=='z'&&h!='{'){
                h++;
                accep= sc.next();
            }
            else{
                ones++;
                accep= sc.next();  }
            if(ones=='z'&&tens=='z'&&h=='{'&&accept==100){
                accept=200;
                ones='a';
                tens='a';
                h='a';
            }if(ones=='z'&&tens=='z'&&h=='{'&&accept==200){
                accept=250;
                ones='a';
                tens='a';
                h='a';
            }if(ones=='z'&&tens=='z'&&h=='{'&&accept==250){
                accept=500;
                ones='a';
                tens='a';
                h='a';
            }if(ones=='z'&&tens=='z'&&h=='{'&&accept==500){
                accept=1000;
                ones='a';
                tens='a';
                h='a';
            }if(ones=='z'&&tens=='z'&&h=='{'&&accept==1000){
                System.out.println("the database is full");
                u=1;
            }
        }
    }
}
