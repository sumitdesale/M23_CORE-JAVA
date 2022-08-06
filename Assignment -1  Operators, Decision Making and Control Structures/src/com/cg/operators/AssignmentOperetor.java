package com.cg.operators;

import java.util.Scanner;

public class AssignmentOperetor {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		a+=b;
		
		System.out.println(a);
		
		sc.close();


	}

}
