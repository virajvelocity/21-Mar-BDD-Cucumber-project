package Types_of_Variable;

public class Test5 
{
    //Non-static global variable call from same class
	
	   int c=30;  // Non-static/Instance global variable
	   
	public static void main(String[] args) 
	{
        //Step-I: Create object/Instance of same class
		Test5 S1 =new Test5();                     //Classname Objectname=new Classname();
		
		//Step-II: Call the variable
			System.out.println(S1.c);  //30			//Objectname.variablename;
	}
	
}
