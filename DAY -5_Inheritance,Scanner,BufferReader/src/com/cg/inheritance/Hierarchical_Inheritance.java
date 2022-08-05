package com.cg.inheritance;

class AndroidVersion
{
	void display() 
	{
		System.out.println("Andorid Versions : ");
	}
}
class Kitkat extends AndroidVersion
{
	void print() 
	{
		System.out.println("kitkat");
	}
}
class Lollipop extends AndroidVersion
{
	void print() 
	{
		System.out.println("lollipop");
	}
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Kitkat k=new Kitkat();
		Lollipop l=new Lollipop();
		
		k.display();
		k.print();
		
		l.display();
		l.print();
		
		

	}

}
