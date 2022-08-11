package com.cg.interfacedemo;
interface Father
{
	void property();
}
interface Mother
{
	void love();
}
class Son implements Father ,Mother
{

	@Override
	public void love() {
		System.out.println("mother loves their child");
		
	}

	@Override
	public void property() {
		System.out.println("Father gives property to son");
		
	}
	
}
public class Multiple_Inheritance_Using_Interfaces {

	public static void main(String[] args) {
		Son s=new Son();
		s.love();
		s.property();

	}

}
