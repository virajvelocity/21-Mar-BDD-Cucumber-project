package Access_specifiers_modifiers;

public class Test1 
{
	//Access specifiers are used to represent scope of members of class (Methods, Variables, Constructors).
	//a. public: If you declare any member of class(Variables, Constructors,Methods) as public then scope of that member remains throught the project.
	//Member of Class--> Variables, Constructors,Methods
	
	
	public int a=15; //Non static global variable
	
	public Test1()
	{
		
	}
	
	public void m1() 
	{
		System.out.println("Hi");
	}
	
	
	public static void main(String[] args) 
	{
		Test1 T1=new Test1();
		System.out.println(T1.a);
		
		  T1.m1();
	}
	
}
