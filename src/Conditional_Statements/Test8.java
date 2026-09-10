package Conditional_Statements;

public class Test8 
{

	public static void main(String[] args) 
	{
		int marks=52;
		
		   //52>=65   //52>65-->false   OR  52=65-->false   -->false
		if(marks>=65) //false
		{
			System.out.println("Distinction");
		}  
				//52>=60   //52>60-->false  OR  52=60-->false-->false
		else if(marks>=60) //false
		{
			System.out.println("First Class");
		}
		       //52>=55     //52>55-->false  OR  52=55-->false-->false
		else if(marks>=55) //false
		{
			System.out.println("Higher second Class");
		}
		       //52>=50     //52>50-->true  OR   52=50-->false -->true
		else if(marks>=50) //true
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
