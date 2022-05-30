package com;

import java.util.Scanner;

public class FinalProject2603 {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int select = 0;
		
		System.out.println("Enter a selection:");
		System.out.println("1. Fibonacci");
		System.out.println("2.");
		System.out.println("3.");
		System.out.println("4.");
		System.out.println("5.");
		System.out.println("Press any other button to exit.");
		
		
		try {
			select = in.nextInt();
		}
		catch(Exception e) {
			select = 0;
		}
		
		
		switch(select) {
		
		case 1:
			System.out.println("Enter how many digits: ");
			int digits = in.nextInt();
			
			System.out.println("Fibonacci: ");
			
			for(int i = 0; i < digits; i++){
				System.out.print(Fibonacci(i) +" ");
			}
		
			break;
			
		default:
			System.out.println("Thank you for using the program.");
		}
	}




	public static int Fibonacci(int num){
		if(num == 0)
			return 0;
		if(num == 1 || num == 2)
			return 1;
		return Fibonacci(num-2) + Fibonacci(num-1);
	}
}






















