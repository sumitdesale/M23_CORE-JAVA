package com.cg.superkeyword;

class A
{
	protected int pin=1234; 
	public void display() 
	{
		System.out.println("pin is :"+pin);
	}	
	
}
class B extends A
{
	public int pin=4512;
	public void display() 
	{
		System.out.println("pin is :"+pin);
		super.display();
	}
	
}
public class Super_Method {

	public static void main(String[] args) {
		B b=new B();
		b.display();

	}

}
