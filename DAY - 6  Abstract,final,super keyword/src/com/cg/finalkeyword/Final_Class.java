package com.cg.finalkeyword;


 final class Fruit
{
	/* final */Fruit()  //we cannot make constructor as final
	{
		System.out.println("constructor");
	}
	void print () 
	{
		System.out.println("parent class");
	}
	
}
class Apple // extends Fruit
{			//if cannot inherit final class into another class
	
	void print () 
	{
		System.out.println("parent class");
	}
	
}
public class Final_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
