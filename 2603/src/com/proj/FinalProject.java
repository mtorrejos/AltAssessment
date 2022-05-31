package com.proj;
import java.util.Scanner;

public class FinalProject {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int select = 0;
		
		System.out.println("Enter a selection:");
		System.out.println("1. Fibonacci");
		System.out.println("2. Factorial of a Number");
		System.out.println("3. Palindrome");
		System.out.println("4. Binary Search");
		System.out.println("5. Reverse a Number");
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
			
		case 2:
			System.out.println("Enter a number: ");
			int num= in.nextInt();
	        System.out.println("The entered number is: "+num);
	        if(num>=0) 
	        {
	           //Call a recursive function to find the factorial
	           int factorial=Factorial(num);
	           System.out.println("The factorial of the entered number is: "+factorial);
	        }
		
			break;
		
		case 3:
			 System.out.println("Enter a number: ");
			 int number =in.nextInt();
		     int np = Palindrome(number, 0);
		      if(np == number)
		    {
		         System.out.println(number+" is palindrome.");
		    }
		      else
		    {
		         System.out.println(number +" is not palindrome.");
		    }
		     
		    break;
		    
		case 4:   
			System.out.println("Enter number of elements in array:");
	        int n=in.nextInt();
	        int ar[]=new int[n];
	        System.out.println("Enter array elements:");
	        for(int i=0;i<n;i++) ar[i]=in.nextInt();
	        System.out.println("Enter element to be searched:");
	        int item=in.nextInt();
	        int index=BinarySearch(ar, item, 0, n-1);
	        if(index==-1) System.out.println("Item not found!");
	        else System.out.println("Item found at index "+index);
	    
		     break;
		      
		case 5:
			System.out.println("Enter a number you want to be reverse: ");
			int num1 =  in.nextInt(); 
	        System.out.print("Reversed Number: ");
	 
	        // calling recursive function
	        // to print the number in
	        // reversed form
	        Reverse(num1);  
		  }		
}
	

	public static int Fibonacci(int num){
		if(num == 0)
			return 0;
		if(num == 1 || num == 2)
			return 1;
		return Fibonacci(num-2) + Fibonacci(num-1);
	}
	
	public static int Factorial(int num){
		 if(num==0)
		      return 1;
		 else if(num==1)
		      return 1;
		 else
		        return num*Factorial(num-1);   
		
	}
	public static int Palindrome(int number, int np){
		   {
		      if(number == 0)
		         return np;
		      // storing reverse of a number
		      np = (np * 10) + (number % 10);
		      return Palindrome (number / 10, np);
		   }
	}
	
    public static int BinarySearch(int[] ar, int item, int first, int last)
    {
        int mid=(first+last)/2;
        while(first<=last)
        {
            if(ar[mid]==item) return mid;
            else if(ar[mid]>item) return BinarySearch
            (ar,item,first,mid-1);
            else return BinarySearch(ar,item,mid+1,last);
        }
        return -1;
    }
    
     public static int Reverse(int num) {
         // base condition to end recursive calls
         if (num < 10) {
             System.out.println(num);
             return 0;
         }
  
         else {
             // print the unit digit of the given number
             System.out.print(num % 10);
  
             // calling function for remaining number other
             // than unit digit
             Reverse(num / 10);
         }
		return num;
     }
		   
 }