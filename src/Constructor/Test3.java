package Constructor;

public class Test3 
{
	
	//Constructor: Constructor name should be same as classname
	//Use: Constructor is used to initialize objects and Non static global variables
	
	//Step-(1) Variable declaration
			int a; //10    //Non static global variable
			int b;//20    //Non static global variable
	
	//Step-(2) Variable initialization/Assignment
			Test3()                 //User defined Constructor
			{
				a=10;
				b=20;
			}
	
	//Step-(3) Variable Usage	
	public void addition() 
	{
		    int Sum=a+b;//30
		    System.out.println(Sum);//30
	}
	
	public static void main(String[] args) 
	{
	    //Create Object of same class
			Test3 T3=new Test3();
			
		//Call the method	
			T3.addition();//30
		
	}
	
	
}
