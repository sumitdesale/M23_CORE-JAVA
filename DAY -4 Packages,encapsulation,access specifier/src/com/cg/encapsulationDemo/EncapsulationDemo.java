package com.cg.encapsulationDemo;

//Here using encapsulation we can access data from different class from the different package 
import com.cg.encapsulation.Encapsulation1;
public class EncapsulationDemo {
	public static void main(String args[]) 
	{
		Encapsulation1 e=new Encapsulation1();
		e.setAmount(50);
		System.out.println(e.getAmount());
	}

}
