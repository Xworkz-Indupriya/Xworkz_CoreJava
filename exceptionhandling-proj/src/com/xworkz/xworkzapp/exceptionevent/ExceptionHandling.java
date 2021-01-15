package com.xworkz.xworkzapp.exceptionevent;

public class ExceptionHandling {

	public String name;

	public static void main(String[] args) {

		System.out.println("Main method started");
		try {
			// ExceptionHandling exceptionHandling=null;
			ExceptionHandling exceptionHandling = new ExceptionHandling();
			exceptionHandling.name = "Tata";
			System.out.println(exceptionHandling.name);
		} catch (NullPointerException e) {
			System.out.println("Name is null cannot access it");
			e.printStackTrace();// It is used when we need to known where the error is there
		}

		System.out.println("Main method ended");

		System.out.println("Main method of array started");
		try {
			int no[] = { 1, 2, 3, 4, 5 };
			System.out.println(no[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array is not accessed");
			e.printStackTrace();
		}
		System.out.println("Main method of array ended");
		
		System.out.println("Main method of arithmetic started ");

		int c = 0;
		try { // It is known as try block
			int a = 23;
			int b = 0;
			c = a / b;
			System.out.println("Passing the flow to catch");
			// if we get error it will go to catch block
		} catch (ArithmeticException e)
		// catch always specifies what type or name of exception.
		// It is known as catch block
		// try block throws an exception which will be taken by catch
		{
			System.out.println("a cannot be divided by zero");
			e.printStackTrace();// It is specified in the class
		}
		System.out.println(c);
		System.out.println("Main method of arithmetic ended");
	}// array index bound exception
}
