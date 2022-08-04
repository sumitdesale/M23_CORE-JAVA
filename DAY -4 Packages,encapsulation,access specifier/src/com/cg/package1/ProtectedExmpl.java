package com.cg.package1;

//this is the example of protected access modifier it can access in different class in same if it is inherited by parent class 
class a
{
	protected int a=30;
	protected void display() 
	{
		System.out.println("number is  : "+a);
	}
	
}
public class ProtectedExmpl extends a {

	public static void main(String[] args) {
		ProtectedExmpl p=new ProtectedExmpl();
		p.display();
		

	}

}
