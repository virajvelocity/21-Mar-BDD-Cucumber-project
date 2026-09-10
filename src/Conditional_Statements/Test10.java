package Conditional_Statements;

public class Test10 
{
	
	public static void main(String[] args) 
	{	
		String Username="admin";
		String Password="admin123";
		
		if(Username=="admin") //admin==admin-->true
		{
			System.out.println("Correct Username");
			
			if(Password=="admin123") //admin123==admin1234-->false
			{
				System.out.println("Correct Password..Login Sucessfull");
			}
			else 
			{
				System.out.println("Incorrect Password..Login Failed");
			}
			
		}
		else 
		{
			System.out.println("Incorrect Username");
		}
		
		
		
		
		
	}
	
	


}
