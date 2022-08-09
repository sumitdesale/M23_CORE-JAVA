package com.cg.finalkeyword;

// final method is inherited but not be override
class Car
{
	String name;
	final void print(String name) 
	{
		System.out.println("My name is : "+name);
	}
}
class Audi extends Car
{
	
}
public class Final_Inherited_Method {

	public static void main(String[] args) {
		Audi a=new Audi();
		a.print("Audi");
		
	}

}
