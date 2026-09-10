package Methods;

public class Demo2 
{
	//Non-Static regular methods call from same class
	public static void main(String[] args) 
	{
		//Step-I: Create an Object of same class(Instance)
			Demo2 D2=new Demo2();     	//Classname Objectname=new Classname();
		
			//Step-II: call the method
				D2.m1();				//Objectname.methodname();
				D2.m2();				//Objectname.methodname();
				D2.m3();   			//Objectname.methodname();
	}
	
	//Non-Static regular method
	public void m1() 
	{
		System.out.println("Non-Static regular method m1() is running from same class");
	}
		
	//Non-Static regular method
	public void m2() 
	{
		System.out.println("Non-Static regular method m2() is running from same class");
	}
	
	//Non-Static regular method
	public void m3() 
	{
		System.out.println("Non-Static regular method m3() is running from same class");
	}
}
