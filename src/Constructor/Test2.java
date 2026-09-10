package Constructor;

public class Test2 
{	//Compiler
	
	//Default Constructor : is provided by Compiler
	
	//Test2(){}   ---->Default Constructor is provided by Compiler internally
	
	public static void main(String[] args) 
	{
		//Step-I: Create object of same class
		Test2 T1=new	 Test2();			//Classname objectname=new Classname();
		
		//Step-II: Call the method
			T1.multiplication();
	}
	
	
	public void multiplication()
	{
		int a=10;
		int b=20;
		
		int multi=a*b;//200
		System.out.println(multi);//200
	}
	
	

}
