package com.capgemini.introduction;

import java.util.*;
public class FloatAndDouble {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//compile time input
		float f= 3.40282347f;
		double d=4.9406564584;
		
		
		System.out.println("float example ="+f);
		System.out.println("double example ="+d);
		
		// runtime input 
		System.out.println("enter numbers in point ");
		float a=sc.nextFloat();
		System.out.println("float runtime input example ="+a);
		
		sc.close();

	}

}
