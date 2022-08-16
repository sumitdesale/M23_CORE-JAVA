package com.cg.superkeyword;

class Android
{
	public String name="lava";
	Android()
	{
		System.out.println("Android name is: "+name);
	}
}
class Lava extends Android
{

	Lava() 
	{
		super(); // this is parent class constructor
		System.out.println("hello");
		
	}
	}
public class Super_Constructor {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Lava l=new Lava();

	}

}
