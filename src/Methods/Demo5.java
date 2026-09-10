package Methods;

public class Demo5 
{
	
	public static void main(String[] args) 
	{
		//Static Regular method call from same class 
			m10();				//methodname();
					
		//Non-Static Regular Method call from same class
		//Step-I: Create an object same class	
			Demo5 D5=new Demo5();		//Classname objectname =new Classname(); 	
		//Step-II: Call the Method 	
				D5.m11();				//Objectname.methodname();
		
		//Static Regular Method	call from different class	
				Demo6.m12();				//classname.methodname(); 		
		
		//Non-Static Regular Method call from different class		
		//Step-I: Create an object of different class		
			Demo6 D6=new Demo6();		//Classname objectname =new Classname(); 	
		//Step-II: Call the Method 			
			D6.m13();							//Objectname.methodname();
	}
	
	//Static Regular Method
	public static void m10() 
	{
		System.out.println("m10() method is running from same class");
	}
	
	//Non-Static Regular Method
	public void m11() 
	{
		System.out.println("m11() method is running from same class");
	}
	
	
	

}
