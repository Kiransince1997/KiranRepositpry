package com.Assignment2;

import java.util.Scanner;

public class GreatestNumber
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("Input the Firstnumber :");
		int a = scan.nextInt();
		System.out.print("Input the Secondnumber :");
		int b = scan.nextInt();
		System.out.print("Inpuet the Thirdnumber :");
		int c = scan.nextInt();
		
		if(a>b && a>c)
		{
			System.out.println("First number is Greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("Second number is Greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("Third number is Greater");
		}
		
		
	}
}
