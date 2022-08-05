package com.cg.inheritance;

class Parent
{
	protected int roll_no;
	 void display()
	{
		System.out.println("hey guys...");
	}
}
class Child extends Parent
{
	void print(int roll_no) 
	{
		System.out.println("roll_no is: "+roll_no);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Child c=new Child();
		c.display();
		c.print(23);
		

	}

}
