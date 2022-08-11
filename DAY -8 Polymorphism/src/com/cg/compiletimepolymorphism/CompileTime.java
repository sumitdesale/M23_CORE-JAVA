package com.cg.compiletimepolymorphism;

class A
{
	void add(int a,int b) 
	{
		System.out.println(a+b);
	}
	
	void add(float a,float b) 
	{
		System.out.println(a+b);
	}
}
public class CompileTime {

	public static void main(String[] args) {
		A obj=new A();
		
		obj.add( 5,6);
		obj.add(5f, 4f);

	}

}
