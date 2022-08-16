package com.capgemini.introduction;
import java.util.*;

public class IntegerRunTimeInput {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println(a);
	//we use print to print ant statement in same line
	System.out.print("output  ");
	
	 // println is use to print output in next line
	System.out.println(b);
	
	//compile time char input
	char c='s';
	System.out.println("compile time input ="+c);
	
	//runtime char input
	char d=sc.next().charAt(0);
	System.out.println("enter charecter");
	System.out.println("run time input "+d);
	
	sc.close();
	
	}

}
