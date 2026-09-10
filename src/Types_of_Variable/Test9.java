package Types_of_Variable;

public class Test9 
{
		int b=20;   //Non-static Global Variable
	
	public static void main(String[] args) 
	{
		//Step-I:Create object of same class 
		 Test9 S4=new Test9();     //Classname objectname=new Classname();
							
		//Step-II: Call the variable
		  System.out.println(S4.b);  //20              //Objectname.variablename;
		  
		  	m1();	//20							//Methodname();  
		  	
		    S4.m2();   //20            //Objectname.methodname();
	}
	
	//Static regular Method
	public static void m1() 
	{
		//Step-I:Create object of same class 
		Test9 S5=new	 Test9();			//Classname objectname=new Classname();
		
		//Step-II: Call the variable
			System.out.println(S5.b); //20	//Objectname.variablename;
	}
	
	//Non Static regular Method
	public void m2() 
	{
			System.out.println(b); //20  //variablename
	}
	
}
