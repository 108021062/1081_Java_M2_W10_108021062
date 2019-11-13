package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
        int a=1,b=1;
        while (a<=x) {
            System.out.print(a + "\t");
            a = a + b;
            b++;
        }
        System.out.println(a);
        a=1;
        while (a<=(x+1)){
            for (int c=1;c<=a;c++){
                System.out.print(a+"\t");
            }
            a++;
        }
        System.out.println();
    }
}


