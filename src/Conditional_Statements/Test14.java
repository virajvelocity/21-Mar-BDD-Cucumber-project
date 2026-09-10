package Conditional_Statements;

public class Test14 
{
	public static void main(String[] args) 
	{
		String Browser="Chrome";
		
		switch(Browser) 			//Chrome
		{
		case "Opera": System.out.println("We are opening an Opera Browser");break;  //Opera  Chrome-->false
		
		case "Firefox": System.out.println("We are opening a Firefox Browser");break; //Firefox Chrome-->false
		
		case "Chrome": System.out.println("We are opening a Chrome Browser");break;  //Chrome  Chrome-->true
		
		case "Safari": System.out.println("We are opening a Safari Browser");break; 
		
		default: System.out.println("We are opening an Edge Browser");
		}
		
    }
	
	
	
	
	
	
	
	
	
}
