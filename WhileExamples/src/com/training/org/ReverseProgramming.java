package com.training.org;

public class ReverseProgramming {
    public static void main(String []args)
    {
        String s1="prajwal";
        String revered_string="";
        int i=s1.length()-1;
        do {
            revered_string+=+s1.charAt(i);
            i--;
        }while (i>=0);
    }
}
