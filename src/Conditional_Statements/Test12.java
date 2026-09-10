package Conditional_Statements;

public class Test12 
{	
	public static void main(String[] args) 
	{	
		String day="Sat";
		
		switch(day) //Sat
		{
		case "Mon": System.out.println("Today is Monday"); break;   //Mon   Sat-->false
	
		case "Tue": System.out.println("Today is Tuesday"); break; //Tue  Sat-->false
		
		case "Wed": System.out.println("Today is Wed"); break;  //Wed Sat-->false
		
		case "Thur": System.out.println("Today is Thursday"); break;  //Thur Sat-->false
		
		case "Fri": System.out.println("Today is Friday"); break;  //Fri Sat-->false
		
		case "Sat": System.out.println("Today is Saturday"); break;  //Sat Sat-->true
		
		case "Sun": System.out.println("Today is Sunday"); break;
		
		default: System.out.println("Invalid input");
		
		}
		
		
		
		
	}
	
	
	

}
