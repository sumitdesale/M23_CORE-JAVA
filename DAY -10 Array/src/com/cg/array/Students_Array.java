package com.cg.array;



class Student
{
	public int roll_no;
	public String name;
	//constructor
	
	Student(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
}
public class Students_Array {

	public static void main(String[] args) {
		Student [] arr=new Student[4];
		
		arr[0]=new Student(101,"sumit");
		arr[1]=new Student(102,"vaibhav");
		arr[2]=new Student(103,"shubham");
		arr[3]=new Student(104,"ashu");
		
		
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println("Element at "+i+" index :"+arr[i].roll_no+" "+arr[i].name );
		}
		
		
	}

}
