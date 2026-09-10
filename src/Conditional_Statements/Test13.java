package Conditional_Statements;

public class Test13 
{

	public static void main(String[] args) 
	{	
		String day="Viraj";
		
		switch(day) //Viraj
		{
		case "Mon": System.out.println("Today is Monday"); break;   //Mon   Viraj-->false
	
		case "Tue": System.out.println("Today is Tuesday"); break; //Tue  Viraj-->false
		
		case "Wed": System.out.println("Today is Wed"); break;  //Wed Viraj-->false
		
		case "Thur": System.out.println("Today is Thursday"); break;  //Thur Viraj-->false
		
		case "Fri": System.out.println("Today is Friday"); break;  //Fri Viraj-->false
		
		case "Sat": System.out.println("Today is Saturday"); break;  //Sat Viraj-->false
		
		case "Sun": System.out.println("Today is Sunday"); break;  //Sun Viraj-->false
		
		default: System.out.println("Invalid input");
		
		}
		
	}
	
}
