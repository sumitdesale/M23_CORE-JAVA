package com.cg.abstractkeyword;

abstract class flower
{
	abstract void print();
	void display() 
	{
		System.out.println("this is normal method");
	}
}
class Rose extends flower
{
	 void print() 
	{
		System.out.println("this is abstarct method");
	}
}
public class Abstarct_Class {

	public static void main(String[] args) {
		//we cannot create the object of abstract class 
		
		Rose r=new Rose();
		r.print();
		r.display();

	}

}
