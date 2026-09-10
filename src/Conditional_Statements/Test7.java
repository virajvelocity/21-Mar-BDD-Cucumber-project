package Conditional_Statements;

public class Test7 
{

	public static void main(String[] args) 
	{
		int marks=68;
		
		   //68>=65   //68>65-->true   OR  68=65-->false   -->true
		if(marks>=65) //true
		{
			System.out.println("Distinction");
		}
		else if(marks>=60) 
		{
			System.out.println("First Class");
		}
		else if(marks>=55) 
		{
			System.out.println("Higher second Class");
		}
		else if(marks>=50) 
		{
			System.out.println("Second Class");
		}
		else if(marks>=35) 
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
		
	}
	
	
}
