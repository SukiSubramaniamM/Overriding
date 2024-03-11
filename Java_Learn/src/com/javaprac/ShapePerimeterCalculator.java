package com.javaprac;
import java.util.Scanner;

public class ShapePerimeterCalculator {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Welcome to Shape Perimeter Calculator!");
	        System.out.println("Which shape do you want to calculate the perimeter for?");
	        System.out.println("1. Square");
	        System.out.println("2. Rectangle");
	        System.out.println("3. Triangle");
	        System.out.print("Enter your choice (1/2/3): ");
	        int choice = scanner.nextInt();

	        double perimeter = 0.0;

	        switch (choice) {
	            case 1: // Square
	                System.out.print("Enter the side length of the square: ");
	                double sideLengthSquare = scanner.nextDouble();
	                perimeter = 4 * sideLengthSquare;
	                break;
	            case 2: // Rectangle
	                System.out.print("Enter the length of the rectangle: ");
	                double lengthRectangle = scanner.nextDouble();
	                System.out.print("Enter the width of the rectangle: ");
	                double widthRectangle = scanner.nextDouble();
	                perimeter = 2 * (lengthRectangle + widthRectangle);
	                break;
	            case 3: // Triangle
	                System.out.print("Enter the length of side 1 of the triangle: ");
	                double side1Triangle = scanner.nextDouble();
	                System.out.print("Enter the length of side 2 of the triangle: ");
	                double side2Triangle = scanner.nextDouble();
	                System.out.print("Enter the length of side 3 of the triangle: ");
	                double side3Triangle = scanner.nextDouble();
	                perimeter = side1Triangle + side2Triangle + side3Triangle;
	                break;
	            default:
	                System.out.println("Invalid choice!");
	                return;
	        }

	        System.out.println("The perimeter of the selected shape is: " + perimeter);

	        scanner.close();
	    }
	}


