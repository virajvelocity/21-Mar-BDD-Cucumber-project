package Methods;

public class Demo1 
{
	//Non-Static regular method call from same class
	
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		
		//Step-I: Create an object/Instance of same class
			Demo1 D1=new	 Demo1();       //Classname Objectname=new Classname();
		
		//Step-II: Call the method	
			D1.m1();					//Objectname.methodname();
		
			
	}
	
	//Non-static regular Method
	public void m1() 
	{
		System.out.println("Non-static Regular Method m1() is running from same class");
	}
	
	
}
