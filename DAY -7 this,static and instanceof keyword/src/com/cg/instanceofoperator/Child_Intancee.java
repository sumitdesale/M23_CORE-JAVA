package com.cg.instanceofoperator;

class A
{
	
}
public class Child_Intancee extends A
{

	public static void main(String[] args) {
		Child_Intancee c=new Child_Intancee();
		
		//here it will print true because main class is inheritated property of class A
		System.out.println(c instanceof A);

	}

}
