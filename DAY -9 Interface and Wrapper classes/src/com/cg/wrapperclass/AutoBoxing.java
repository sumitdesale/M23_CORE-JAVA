package com.cg.wrapperclass;

public class AutoBoxing {

	public static void main(String[] args) {
		int a=40;
		Integer i=a; //converting primitive to wrapper class object
		Integer j=new Integer(10);
		
		System.out.println(a+"  "+i+"  "+j);
	}

}
