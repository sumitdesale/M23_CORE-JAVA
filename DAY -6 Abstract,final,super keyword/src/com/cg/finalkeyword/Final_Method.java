package com.cg.finalkeyword;

class A
{
	A()
	{
		System.out.println("constructor");
	}
	
	//we cannot use final method in another class
	
	
//	final  void print () 
//	{
//		System.out.println("parent class");
//	}
}
class B extends A
{
	void print () 
	{
		System.out.println("parent class");
	}
	
}
public class Final_Method {

	public static void main(String[] args) {
		B obj=new B();
		obj.print();
		

	}

}
