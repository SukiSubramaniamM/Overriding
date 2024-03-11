package com.javaprac;
import java.util.Scanner;
public class ReverseNumber {
	public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter a number to reverse: ");
	       int number = scanner.nextInt();

	       int reversedNumber = reverseNumber(number);
	       System.out.println("Reversed number: " + reversedNumber);

	       scanner.close();
	    }

	    // Method to reverse a number
	    public static int reverseNumber(int number) {
	        int reversedNumber = 0;

	        while (number != 0) {
	            int digit = number % 10; // Extract the last digit
	            reversedNumber = reversedNumber * 10 + digit; // Append the digit to reversedNumber
	            number /= 10; // Move to the next digit
	        }

	        return reversedNumber;
	    }
	}




