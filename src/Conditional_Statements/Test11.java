package Conditional_Statements;

public class Test11 
{
	public static void main(String[] args) 
	{
		String UserName="admin";
		String Password="admin123";
			
		if(UserName=="admin") //admin==admin-->true
		{
			System.out.println("Correct Username");
			
			if(Password=="admin123") //admin123==admin123-->true
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
