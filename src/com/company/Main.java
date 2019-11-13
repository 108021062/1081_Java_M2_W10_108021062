package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
     int count =0,res=1;
     for (int a=x;a>1;a--){
         res*=a;
     }
     while (res %10==0){
         count++;
         res/=10;
     }
        System.out.println(count);
    }
}


