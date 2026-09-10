package Conditional_Statements;

public class Test9 
{
	
	public static void main(String[] args) 
	{
		int marks=35;
		
		   //35>=65    //35>65-->false    OR   35=65-->false  --->false
		if(marks>=65) //false
		{
			System.out.println("Distinction");
		}  
				//35>=60    //35>60  OR 35=60    --->false
		else if(marks>=60) //false
		{
			System.out.println("First Class");
		}
		       //35>=55    //35>55 OR 35=55-->false
		else if(marks>=55) //false
		{
			System.out.println("Higher second Class");
		}
		       //35>=50     //35>50 OR 35=50---> false
		else if(marks>=50) //false
		{
			System.out.println("Second Class");
		}
		       //35>=35   //35>35-->false  OR 35=35 --->true---> true
		else if(marks>=35) //true
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
		
	
	
	
	
	
	
	}
	
	
	

}
