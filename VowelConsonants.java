package com.Assignment2;

import java.util.Scanner;

public class VowelConsonants
{
	public static void main(String[] args) 
	{
		char c;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Alphabet");
		c = scan.nextLine().toLowerCase().charAt(0);
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			System.out.println("given numner is Vowel");
		}
		else
		{
			System.out.println("Given number is Consonant");
		}
		
	}
}
