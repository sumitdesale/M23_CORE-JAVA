package com.cg.list;

import java.util.LinkedList;


public class LinkedListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		LinkedList obj=new LinkedList<>();
		
		obj.add(11);
		obj.add("sumit");
		obj.add(73.66);
		obj.add(10);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.remove(2));
		System.out.println(obj);

	}

}
