package com.Assignment2;

import java.util.Scanner;

public class QuadraticEquation 
{
	public static void main(String[] args) 
	{
		double x1;
		double x2,d;
		
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a :");
		int a = scan.nextInt();
		System.out.print("Input b :");
		int b = scan.nextInt();
		System.out.println("Input c :");
		int c = scan.nextInt();
		
		d = b*b -4*a*c;
//		x1 = (-b + Math.sqrt(d))/2*a;
//		x2 = (-b - Math.sqrt(d))/2*a;
		System.out.println("Value of d :"+d);
			
		if(d>0)
		{
			x1 = (-b + Math.sqrt(d))/2*a;
			x2 = (-b - Math.sqrt(d))/2*a;
			
			System.out.print("The roots are :");
			System.out.print(x1);
			System.out.print(" and ");
			System.out.println(x2);
		}
		else if(d==0)
		{
			x1 = (-b /2*a); 
			x2 = (-b /2*a); 
			System.out.print("The roots are :");
			System.out.print(x1);
			System.out.print(" and ");
			System.out.println(x2);
		}
		else if (d<0)
		{
			x1 = (-b + (Math.sqrt(d)))/2*a;
			x2 = (-b - (Math.sqrt(d)))/2*a;
			System.out.print("The roots are :");
			System.out.print(x1);
			System.out.print(" and ");
			System.out.println(x2);
			
		}
	}
} 
