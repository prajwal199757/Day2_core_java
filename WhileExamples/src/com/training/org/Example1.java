package com.training.org;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of iterations");
        int number = input.nextInt();

        while (number >= 0) {
            sum += number;
            number--;
        }

        System.out.println("sum of elements " + sum);

    }
}
