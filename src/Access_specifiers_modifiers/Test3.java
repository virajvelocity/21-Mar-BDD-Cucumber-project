package Access_specifiers_modifiers;

public class Test3 
{
	
	//b. private: 
	// If you declare any member of class(Variables, Constructors,Methods) as private, then scope of that member remains only within the class.
	// It can't be accessed from other classes.
    //Member of Class--> Variables, Constructors,Methods
	
	//Singleton Class: if class has private constructor then that class is known as Singleton Class
	
	private int b=20;  //Non Static global Variable
	
	 Test3()
	{
		
	}
	
	private void m2() 
	{
		System.out.println("Hello");
	}
	
	
	public static void main(String[] args) 
	{
		Test3 T3=new Test3();
		System.out.println(T3.b);  //20
		
		T3.m2();
	}

}
