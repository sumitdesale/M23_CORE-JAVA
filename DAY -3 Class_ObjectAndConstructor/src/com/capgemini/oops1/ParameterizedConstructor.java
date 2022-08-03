package com.capgemini.oops1;

class demo
{
	int a;
	String s;
	demo(int a1 , String s1)
	{
		a=a1;
		s=s1;
	}
	void print() 
	{
		System.out.println(a+"     "+s);
	}
}
public class ParameterizedConstructor {

	public static void main(String[] args) {
		demo d=new demo(2, "abc");
		d.print();


	}

}
