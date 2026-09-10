package Methods;

public class Sample3 
{
	//1) Static regular Method call from same class
	
	//Static Regular Method
	public static void m3() 
	{
		System.out.println("Static Regular Method m3() is running from same class");
	}

	public static void main(String[] args) 
	{
		System.out.println("Hi");
		m1();  		//methodname();  
		m1();		//methodname();
		m2();		//methodname();
		m3();		//methodname();
	}
	
	//Static Regular Method
	public static void m1() 
	{
		System.out.println("Static Regular Method m1() is running from same class");
	}
	
	//Static Regular Method
	public static void m2() 
	{
		System.out.println("Static Regular Method m2() is running from same class");
	}
	

}
