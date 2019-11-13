package com.company;

import java.util.Scanner;
import  java.math.BigInteger;
public class Main {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x=sc.nextInt();
  BigInteger a=new BigInteger("1");
  int b=0;
  for (int c=x;c>1;c--){
      a=a.multiply(new BigInteger(Integer.toString(c)));
  }
  while (a.mod(new BigInteger("10")).intValue()==0){
      b++;
      a=a.divide(new BigInteger("10"));
        }
        System.out.println(b);
    }
}


