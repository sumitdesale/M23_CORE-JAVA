package com.cg.exceptionhandling;

import java.util.Scanner;

public class ArithmeticExceptions {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=15;
		System.out.println("enter b value as 0 it will give u error");

		int b=sc.nextInt();
		//try block contains exception code and non exception code
		//catch block handle exception and print some message
		try 
		{
		int res=a/b;
		System.out.println(res);
		}
		catch(Exception e) 
		{
			System.out.println("Not divisible by 0 "+e);
		}
		sc.close();
		
	

	}

}
