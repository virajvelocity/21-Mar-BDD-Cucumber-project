package Constructor;

public class Cricket 
{
	//Non-Static global Variables
		String Playername; //Virat  //Sanju
		int Runs;  //100  //101
		
	//Constructor: Constructor name should be same as classname
	//Use: Constructor is used to initialize objects and Non static global variables
		          //Sanju    //101
		Cricket(String P1, int R1) 
		{
			Playername = P1; //Sanju 
			Runs = R1; //101
		}
		
	public static void main(String[] args) 
	{
		//Step-I:Create object of a same class
		Cricket	RCB=new	Cricket("Virat",100);          //Classname objectname=new Classname();
		System.out.println(RCB.Playername); //Virat //objectname.variablename;
		System.out.println(RCB.Runs); //100        //objectname.variablename;
			
		
		
		//Step-I:Create object of a same class
		Cricket  CSK=new Cricket("Sanju",101);       //Classname objectname=new Classname();
		System.out.println(CSK.Playername); //Sanju  //objectname.variablename;
		System.out.println(CSK.Runs); //101     //objectname.variablename;
				
		//Step-I:Create object of a same class
		  Cricket MI=new Cricket("Rohit", 102);				//Classname objectname=new Classname();  
		  System.out.println(MI.Playername); //Rohit	//objectname.variablename;  
		  System.out.println(MI.Runs);//102	      //objectname.variablename;
	}
	
}
