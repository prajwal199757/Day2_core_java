package com.training.org;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String []args)
    {
        //Scanner scan=new Scanner(System.in);
        //int s1=scan.nextInt();
        for(int i=1;i<=100;i++)
        {
            if(i%1==0 && i%i==0)
            {
                System.out.println(i);
            }
        }

    }
}
