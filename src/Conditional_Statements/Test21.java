package Conditional_Statements;

public class Test21 
{

	public static void main(String[] args) 
	{
		int age=14;
		
		          //14>=18   1) 14>18-->false   OR  14=18-->false   -->false
	String Output =(age>=18) ? "Eligible to vote" : "Not eligible to vote";
		
		System.out.println(Output);  //Not eligible to vote
	}
	
	
	
	
	
}
