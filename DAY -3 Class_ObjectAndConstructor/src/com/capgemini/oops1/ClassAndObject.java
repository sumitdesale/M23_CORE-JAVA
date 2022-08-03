package com.capgemini.oops1;

import java.util.Scanner;

// demo on how to use class and object
class Car
{
	 
	 void print(int b) 
	 {
		 
		 System.out.println(b);
	 }
}
public class ClassAndObject  {

	public static void main(String[] args) {
		 Car obj=new Car();
		 //obj.a=55;
		 //obj.print();
		 
		 Scanner sc =new Scanner(System.in);
		 int b=sc.nextInt();
		 obj.print(b);
		 
		
		
	}

}
