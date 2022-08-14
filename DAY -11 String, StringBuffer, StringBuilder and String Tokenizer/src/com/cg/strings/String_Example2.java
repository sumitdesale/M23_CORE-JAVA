package com.cg.strings;

import java.util.Scanner;

public class String_Example2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	
		System.out.println("write here :");
		String str=new String(sc.nextLine());
		System.out.println(str);

	}

}
