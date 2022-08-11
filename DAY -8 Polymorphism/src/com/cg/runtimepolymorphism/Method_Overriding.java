package com.cg.runtimepolymorphism;

//One class is not enough to create method overriding
//create same method with different class using inheritance with same parameter
class Multiplication
{
	void accept(int a,int b) 
	{
		System.out.println("parent :"+a*b);
	}
}
class Mult extends Multiplication
{
	void accept(int x,int y) 
	{
		System.out.println("child :"+x*y);
	}
	
}
public class Method_Overriding {

	public static void main(String[] args) {
		//In method overriding you have to create different obj for different class
		Mult m1=new Mult();
		Multiplication m2=new Multiplication();
		
		m1.accept(2, 3);
		m2.accept(4, 4);
	}

}
