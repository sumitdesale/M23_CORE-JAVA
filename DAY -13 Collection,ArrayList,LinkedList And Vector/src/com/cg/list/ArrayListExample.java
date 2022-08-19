package com.cg.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List obj=new ArrayList<>();
		 
		obj.add(11);
		obj.add("sumit");
		obj.add(73.66);
		System.out.println(obj);
		System.out.println(obj.size());
		System.out.println(obj.remove(2));
		System.out.println(obj);
		

	}

}
