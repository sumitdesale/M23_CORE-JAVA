package com.cg.thiskeyword;
class AB
{
	public int num;
	AB()
	{
		System.out.println("welcome to m23 class");
		
	}
	AB(int num)
	{
		this.num=num;
		System.out.println("Num is "+num);
		
	}
}
public class Constructor_Instance {

	public static void main(String[] args) {
	@SuppressWarnings("unused")
	AB obj=new AB();
	AB ob=new AB(5);
	System.out.println(ob.num);
	
	}
}