package com.cg.statickeyword;

public class Static_Box {

	double width;
	double height;
	static int count;
	public Static_Box(double width, double height) 
	{
		this.width=width;
		this.height=height;
	}
	public Static_Box()
	{
		super();
		int cnt=0;
		cnt++;
		System.out.println("cnt is :"+cnt);
		count++;
		System.out.println("count "+count);
	}
	public static void main(String[] args) {
		Static_Box s=new Static_Box();
		//Static_Box s1=new Static_Box(12,13);
		s.width=22;
		s.height=12;
		System.out.println(s.width);
	}

}
