package com.Assignment2;

import java.util.Scanner;

public class InputData 
{
	public static void main(String[] args)
	{
		System.out.print("Input number : ");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		if(n>0)
		{
			System.out.println("Positive number");
		}
		else if(n<0)
		{
			System.out.println("Negative number");
		}
		else
		{
			System.out.println("Number is Zero");
		}
	}
}
