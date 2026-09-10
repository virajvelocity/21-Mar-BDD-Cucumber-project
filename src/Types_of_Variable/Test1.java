package Types_of_Variable;

public class Test1 
{
	//Example-I: Local Variable
	//Scope:Only Within method where it is declared
	
	                         //30
	public static void m1(int c) //Local Variable
	{
		int a=10;  //Local Variable
		System.out.println(a);    //10
		
		int b=20;  //Local Variable
		System.out.println(b);     //20
		
			int Sum=a+b+c;  //60          //Local Variable
			System.out.println(Sum);//60
	}
	
	
	public static void main(String[] args) 
	{
	    	m1(30);				//methodname();
	    	
	  
	    	
	}
	
	
	

}
