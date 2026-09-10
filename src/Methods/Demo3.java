package Methods;

public class Demo3 
{
	//Non-Static regular methods call from different class
	
	public static void main(String[] args) 
	{
		//Step-I: Create an Object of Different class
		Demo4 D3=new	 Demo4();	//Classname Objectname=new Classname();
		
		//Step-II: Call the method
			D3.m4();				//Objectname.methodname();
			D3.m5();				//Objectname.methodname();
			D3.m6();    			//Objectname.methodname();
		
	}
	
	
}
