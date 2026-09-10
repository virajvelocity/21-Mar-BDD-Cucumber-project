package Methods;

public class Demo9 
{

	public static void main(String[] args)
	{
		
		cricketinfo("Virat", 10000, 51, 'A', 50.34);           //methodname();
		
		cricketinfo("Rohit",8000,100,'B', 38.29); 			//methodname();
	}
	
	//Static Regular Method-->with Parameter method
	public static void cricketinfo(String Playername, int runs, int wickets, char contractgrade, double avgrun) 
	{		
		System.out.println(Playername);   //String Playername="Rohit";
		System.out.println(runs);       //int runs=8000;
		System.out.println(wickets);    //int wickets=100;
		System.out.println(contractgrade);  //char contractgrade='B';
		System.out.println(avgrun);      //double avgrun=38.29;
	}
	
	
	
}
