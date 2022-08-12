package com.Assignment2;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args) 
	{
		System.out.println("Input the year");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
		if(year%4==0)
		{
			if(year%100==0 && year%400==0)
			{
			System.out.println(year +" is a Leap year");
			}
			else
			{
				System.out.println(year +" is not a Leap year");
			}
		}
		else
		{
			System.out.println(year +" is not Leap year");
		}
		
	}
}
