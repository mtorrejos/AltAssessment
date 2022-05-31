package com.proj;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class FinalProjectGUI extends JFrame implements ActionListener{

	JButton btnFibonacci, btnFactorial, btnPalindrome, btnBinarySearch,btnReverseANum;
	static String rev;

	public static void main(String[] args) {
		FinalProjectGUI gui = new FinalProjectGUI();
	}

	public FinalProjectGUI() {
		setTitle("FinalProject");
		new JFrame();
		setBounds(100, 100, 410, 325);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Select a Program:");
		lblNewLabel.setFont(new Font("Yu Gothic UI Semibold", Font.PLAIN, 14));
		lblNewLabel.setBounds(34, 26, 183, 25);
		getContentPane().add(lblNewLabel);
		
		btnFibonacci = new JButton("Fibonacci");
		btnFibonacci.setBounds(44, 62, 250, 31);
		btnFibonacci.addActionListener(this);
		getContentPane().add(btnFibonacci);
		
		btnFactorial = new JButton("Factorial");
		btnFactorial.addActionListener(this);
		btnFactorial.setBounds(44, 104, 250, 31);
		getContentPane().add(btnFactorial);
		
		btnPalindrome = new JButton("Palindrome");
		btnPalindrome.addActionListener(this);
		btnPalindrome.setBounds(44, 146, 250, 31);
		getContentPane().add(btnPalindrome);
		
		btnBinarySearch = new JButton("Binary Search");
		btnBinarySearch.setBounds(44, 188, 250, 31);
		btnBinarySearch.addActionListener(this);
		getContentPane().add(btnBinarySearch);
		
		btnReverseANum = new JButton("Reverse a Number");
		btnReverseANum.setBounds(44, 230, 250, 31);
		btnReverseANum.addActionListener(this);
		getContentPane().add(btnReverseANum);
		
		setVisible(true);
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
	
    	public static int BinarySearch(int[] ar, int item, int first, int last) {
		int mid=(first+last)/2;
		while(first<=last) {
			if(ar[mid]==item) 
				return mid;
			else if(ar[mid]>item) 
				return BinarySearch(ar,item,first,mid-1);
	    		else 
				return BinarySearch(ar,item,mid+1,last);
		}
		return -1;
   	}
    
   	public static int Reverse(int num) {
        // base condition to end recursive calls
        	if (num < 10) {
            	//System.out.println(num);
            		rev+=String.valueOf(num);
            		return 0;
        	}
 
		else {
		    // print the unit digit of the given number
		    //System.out.print(num % 10);
		    rev+=String.valueOf(num%10);
		    // calling function for remaining number other
		    // than unit digit
		    Reverse(num / 10);
		}
			return num;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int digits = 0;
		String fib[];
		if(e.getSource() == btnFibonacci) {
			try {
				digits = Integer.parseInt(JOptionPane.showInputDialog("How many digits?"));
				fib = new String[digits];
				if(digits == 0) {
					JOptionPane.showMessageDialog(null, "Invalid Input");
				}
				
				else {
					for(int i = 0; i < digits; i++){
						if(i == 0)
							fib[i] = ""+ Fibonacci(i);
						else
							fib[i] = " " + Fibonacci(i);
					}
					
					JOptionPane.showMessageDialog(null, "Fibonacci up to " + digits + ":\n" + Arrays.toString(fib));
				}
			}
			
			catch(Exception err) {
				digits = 0;
			}		
		}
		
		if(e.getSource() == btnFactorial) {
			int num = 0;
				try {
					num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
					int factorial = Factorial(num);
					if(num>0)
						JOptionPane.showMessageDialog(null,"The factorial of the entered number is: "+factorial);
					else
						JOptionPane.showMessageDialog(null,"Invalid Input");
				}
				
				catch(Exception err) {
					num = 0;
				}
		}
		
		if(e.getSource() == btnPalindrome) {
			int number;
			try {
				number = Integer.parseInt(JOptionPane.showInputDialog("Enter a number:"));
			    int np = Palindrome(number, 0);
			    if(np == number)
			    	JOptionPane.showMessageDialog(null,number+" is palindrome.");
	
			    else
			    	JOptionPane.showMessageDialog(null,number +" is not palindrome.");
				}
			
			catch(Exception err) {
				number = 0;
			}
		}
		
		if(e.getSource() == btnBinarySearch){
			int number = 0;
			try {
				number = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of elements:"));
				if(number > 0) {
					int[] ar = new int[number];
					for(int i=0;i<number;i++)
						ar[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter int ar[" + i + "]:" ));

					int search = Integer.parseInt(JOptionPane.showInputDialog("Enter the number to be searched:"));
					
					int index=BinarySearch(ar, search, 0, number-1);
			        if(index==-1) 
			        	JOptionPane.showMessageDialog(null,"Item not found!");
			        else 
			        	JOptionPane.showMessageDialog(null,"Item found at index "+index);
				}
				
				else
					JOptionPane.showMessageDialog(null,"Invalid Input");
			}
			
			catch(Exception err) {
				number = 0;
			}
			
		}
		
		if(e.getSource() == btnReverseANum) {
			int num = 0;
			rev = "";
			try {
				num = Integer.parseInt(JOptionPane.showInputDialog("Enter the number you want to reverse: "));
				Reverse(num);
				JOptionPane.showMessageDialog(null,"Reversed Num: "+ rev);
			}
			
			catch(Exception err) {
				num = 0;
			}
		}
		
		
	}
}
