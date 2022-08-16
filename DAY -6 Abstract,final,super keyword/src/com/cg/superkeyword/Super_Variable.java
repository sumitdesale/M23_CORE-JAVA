package com.cg.superkeyword;

class Color
{
	protected String name="orange";
	protected void display() 
	{
		System.out.println("Color is  :"+name);
	}
}
class Blue extends Color
{
	public String name="Blue";
	
	public void display() 
	{
		System.out.println(name);
		//super keyword is use to refer parent class variable
		System.out.println("Color is  :"+super.name);
	}
}
public class Super_Variable {

	public static void main(String[] args) {
		Blue b=new Blue();
		b.display();
	}

}
