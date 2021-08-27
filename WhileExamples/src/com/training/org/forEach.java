package com.training.org;

public class forEach {
    public static void main(String []args)
    {
        String name[]={"Chiku","Annu","Mannnu","Chintu","Pappu"};
        String message="Hello World";
        for(String str:name)
            System.out.println(str);

        for(char ch:message.toCharArray())
            System.out.println(ch);
    }
    }

