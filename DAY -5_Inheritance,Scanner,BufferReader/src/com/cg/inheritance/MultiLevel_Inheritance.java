package com.cg.inheritance;

class Bike
{
	protected int speed;
	void display() 
	{
		System.out.println("like to ride a bike");
	}
}
class Pulser extends Bike
{
	protected String color;
	void print(int speed) 
	{
		System.out.println("speed is :"+speed);
	}
}
class Pulser125 extends Pulser
{
	void accept(String color)
	{
		System.out.println("color is :"+color);
	}
}

public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		Pulser125 p=new Pulser125();
		p.display();
		p.print(80);
		p.accept("black");
		

	}

}
