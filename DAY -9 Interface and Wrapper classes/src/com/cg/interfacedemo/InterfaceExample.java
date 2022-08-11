package com.cg.interfacedemo;

interface A
{
	//abstract method by default
	void print();
	void display();
}
class B implements A
{
	public void print() 
	{
		System.out.println("hello");
	}

	@Override
	public void display() 
	{
		System.out.println("namaste");	
	}
}
public class InterfaceExample {

	public static void main(String[] args) {
		B b= new B();
		//A a=new A();
		//we cannot create object of interface
		b.display();
		b.print();
		
	}

}
