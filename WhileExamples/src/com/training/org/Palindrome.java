package com.training.org;

import java.util.Scanner;

public class Palindrome {
    public static void main(String []args)
    {
        System.out.println("enter string");
        Scanner scan=new Scanner(System.in);
        String s1=scan.next();
        String revered_string="";
        int i=s1.length()-1;
        do {
            revered_string+=+s1.charAt(i);
            i--;
        }while (i>=0);

        if(s1.equals(revered_string))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }
}
}
