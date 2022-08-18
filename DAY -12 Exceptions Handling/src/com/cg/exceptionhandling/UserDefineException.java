package com.cg.exceptionhandling;

@SuppressWarnings("serial")
class CustomException extends Exception 
{
	private int detail;	public CustomException(int detail) 
	{
		super();		
		this.detail=detail;
	}
	public CustomException(String message) 
	{
		super(message);
	}
	@Override
	public String toString() {
		return "CustomException [detail=" + detail + "]";
	}
  
	
}
public class UserDefineException {
	static void accept(int a) throws CustomException 
	{
		System.out.println("called compute");
		if(a>0)
			throw new CustomException(a);
		System.out.println("no exception");
	} 
	static void print(String b) throws CustomException 
	{
		
		String c="java";
		if(c!=b) 
		{
			throw new CustomException(c);
		}
		else 
		{
			System.out.println("no exception");
		}
			
	}

	public static void main(String[] args) {
		try 
		{
			accept(11);
			//print("java");
		}
		catch(CustomException e) 
		{
			System.out.println(e);
		}
	}

}
