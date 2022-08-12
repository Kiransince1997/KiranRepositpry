package com.Assignment2;

import java.util.Scanner;

public class FloatingPoint
{
	public static void main(String[] args) throws Exception
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a Value :");
		float f =scan.nextFloat();
		
		if(f>0)
		{
			System.out.println("Number is Positive");
		}
		else if(f==0)
		{
			System.out.println("Number is Zero");
		}
		else if(f<0)
		{
			System.out.println("Number is negative");
		}
	}
}
