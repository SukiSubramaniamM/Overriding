package com.javaprac;

import java.util.Scanner;

public class inputuser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		System.out.println("what is your name?");
		String name = scanner.nextLine();
		System.out.println("hello " + name);

	}

}
