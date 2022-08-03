package com.capgemini.oops1;


class animal
{
	int a;
	animal()
	{
		a=15;
	}
	void display() 
	{
		System.out.println(a);
	}
}
public class NonParameterizedConstructor {

	public static void main(String[] args) {
		animal obj=new animal();
		obj.display();

	}

}
