package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
       long x=sc.nextLong();
       while (x>0){
           System.out.print(x%10);
           x/=10;
       }
        System.out.println();
    }
}


