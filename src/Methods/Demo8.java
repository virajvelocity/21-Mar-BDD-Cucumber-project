package Methods;

public class Demo8 
{	
	public static void main(String[] args) 
	{
		addition(); 			//30			//methodname();
		addition();			//30			//methodname();
		addition(20,50);		//70			//methodname();
		addition(100,200);	//300	    //methodname();
		addition(5,90);   	//95         //methodname();
		
		//Step-I: Create object of same class
			Demo8 S1=new	 Demo8();			//Classname objectname=new Classname();
			
		//Step-II: Call the method
			S1.Multiplication(10,20,30);								//Objectname.methodname();
	}	
	
	//Static Regular Method-->Zero/Without parameter method
	public static void addition() 
	{
		int a=10;
		int b=20;	
		int Sum1=a+b;//30
		System.out.println(Sum1);  //30
	}
	
	//Static Regular Method-->2 int parameter method
	public static void addition(int c, int d) 
	{
				int Sum2=c+d; //95
				System.out.println(Sum2);//95
	}
	
	//Non-Static Regular Method-->with parameter method
	public void Multiplication(int x, int y, int z) //int x=10;   int y=20;  int z=30;
	{
		int multi=x*y*z;  //6000
		System.out.println(multi); //6000
	}
	
	
	
	
	
	
	
}
