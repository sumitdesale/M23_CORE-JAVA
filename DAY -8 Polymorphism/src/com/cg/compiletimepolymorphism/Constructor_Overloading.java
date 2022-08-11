package com.cg.compiletimepolymorphism;
class Triber
{
	int speed;
	String engine;
	Triber()
	{
		System.out.println("Renault-kiger");
	}
	//Parameterized
	Triber(int speed,String engine)
	{
		this.speed=speed;
		this.engine=engine;
		 System.out.println("speed is :"+speed+" engine is : "+engine);
	}
}
public class Constructor_Overloading {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		Triber t1=new Triber();
		@SuppressWarnings("unused")
		Triber t2=new Triber(45,"Disel");

	}

}
