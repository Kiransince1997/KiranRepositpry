package com.Assignment2;

import java.util.Scanner;

public class Comparision
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input floating point number :");
		double i = scan.nextDouble();
		System.out.print("Input floating point number :");
		double j = scan.nextDouble();
		
		if(i==j)
		{
			System.out.println("Number are same");
		}
		else
		{
			System.out.println("They are different");
		}
	}
}
