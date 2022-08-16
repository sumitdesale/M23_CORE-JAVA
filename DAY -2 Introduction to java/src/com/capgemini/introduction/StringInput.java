package com.capgemini.introduction;
 import java.util.*;
public class StringInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("write sentense");
		 String a=sc.next();
		 String b=sc.nextLine();
		 
		 // it will print the only first word of sentense 
		 System.out.println("1st output is ="+a);
		 // it will print whole sentense
		 System.out.println("2nd output is ="+b);
		 
		 sc.close();
		
	}

}
