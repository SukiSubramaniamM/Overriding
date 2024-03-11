package com.javaprac;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the limit for the fibonacci series:");
		int limit = scanner.nextInt();
		
	 System.out.println("Fibonacci series up to " + limit + ":");
        generateFibonacciSeries(limit);

        scanner.close();
    }

  
    public static void generateFibonacciSeries(int limit) {
        int num1 = 0, num2 = 1, nextTerm = 0;

       
        System.out.print(num1 + " " + num2 + " ");

 
        while (nextTerm <= limit) {
            nextTerm = num1 + num2;
            if (nextTerm <= limit) {
                System.out.print(nextTerm + " ");
            }
            num1 = num2;
            num2 = nextTerm;
        }
    }
}

