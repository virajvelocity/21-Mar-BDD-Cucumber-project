package Types_of_Variable;

public class Test8 
{     
	    static int a=10;   //Static global Variable
    
	public static void main(String[] args) 
	{
		System.out.println(a);	//10   	//variablename
		  m1(); //10                    //methodname();
		  
		//Step-:Create object of same class  
		  Test8	S3=new	Test8();  	//Classname objectname=new Classname();
		 //Step-II: Call the method
		  		S3.m2();		//10			//Objectname.methodname();
		  
	}
	
	//Static regular Method
	public static void m1() 
	{
		System.out.println(a); //10  //Variablename
	}
	
	//Non Static regular Method
	public void m2() 
	{
		System.out.println(a); //10   //Variablename
	}
	
	
	
	
}
