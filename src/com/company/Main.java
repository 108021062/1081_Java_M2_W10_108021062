package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        for (int a=3;a<=x;a++){
            for (int b=a+1;b<=x;b++){
                for (int c=b+1;c<x;c++){
                    if ((a+b+c)<=x){
                        if ((a*a+b*b)==c*c){
                            System.out.println(a+"\t"+b+"\t"+c);
                        }
                    }
                }
            }
        }

    }
}


