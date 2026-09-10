package Constructor;

public class Test1 
{
	//Non-static/Instance global variables
		int a;   //0
		String b;  //null
		double c;  //0.0
		boolean d;  //false
		char e;  //null character
		
		public static void main(String[] args) 
		{
			//Step-I: Create object of same class
			Test1	S1=new	Test1();						//Classname objectname=new Classname();
			//Step-II: Call the variable
			System.out.println(S1.a);  //0        		//Objectname.variable;
			System.out.println(S1.b); //null             //Objectname.variable;
			System.out.println(S1.c);  //0.0				//Objectname.variable;
			System.out.println(S1.d);  //false			//Objectname.variable;
			System.out.println(S1.e); //null character    //Objectname.variable;
			
			//Step-I: Create object of same class
			Test1	S2=new	Test1();			//Classname objectname=new Classname();
			//Step-II: Call the variable
			System.out.println(S2.a);  //0        //Objectname.variable;
			System.out.println(S2.b); //null       //Objectname.variable;
			System.out.println(S2.c);  //0.0       //Objectname.variable;
			System.out.println(S2.d); //false      //Objectname.variable;
			System.out.println(S2.e); //null character  //Objectname.variable;
			
				
		}
		
		
		

}
