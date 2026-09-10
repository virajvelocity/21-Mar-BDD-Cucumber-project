package Conditional_Statements;

public class Test15 
{
	public static void main(String[] args) 
	{
		int day=15;
		
		switch(day)    //15
		{
		case 1: System.out.println(" Today is monday"); break;   //1  4-->false
		
		case 2: System.out.println(" Today is Tuesday"); break;  //2  4-->false
		
		case 3: System.out.println(" Today is Wed"); break;  //3  4-->false
		
		case 4: System.out.println(" Today is Thurday"); break;  //4  4-->true
		
		case 5: System.out.println(" Today is Friday"); break;
		
		case 6: System.out.println(" Today is Saturday"); break;
		
		case 7: System.out.println(" Today is Sunday"); break;
		
		default: System.out.println("Invalid input");
		}
		
		
		
	}
	
	
	
	
}
