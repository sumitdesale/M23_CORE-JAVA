package com.cg.compiletimepolymorphism;

//method overloading

class Shape
{
	//by changing the number of argument
	int area(int a) 
	{
		return a*a;    //it is necessory 
	}
	int area(int a ,int b) 
	{
		return a*b;    
	} 
}
public class Method_overloading {

	public static void main(String[] args) {
		Shape s=new Shape();
		s.area(5);
		s.area(5, 10);
		
		System.out.println(s.area(5));
		System.out.println(s.area(5, 10));
	}

}
