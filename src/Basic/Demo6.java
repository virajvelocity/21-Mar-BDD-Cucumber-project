package Basic;

public class Demo6 
{
	
	String Cricketer; //Virat  //Rohit  //Shubman                 
	int Runs;           //100  //50      //60                               
		       
	Demo6(String C1,int R1)
	{
		this.Cricketer=C1;  //Virat  //Rohit  //Shubman 
		this.Runs=R1;         //100   //50      //60
		  
		System.out.println(Cricketer); //Virat  //Rohit  //Shubman 
		System.out.println(Runs);  //100     //50      //60
	}
	
	public static void main(String[] args) 
	{	
		Demo6 T1=new Demo6("Virat",100); //Classname objectname=new Classname();
		
		Demo6 T2=new Demo6("Rohit",50);   //Classname objectname=new Classname();
		
		Demo6 T3=new Demo6("Shubman", 60);  //Classname objectname=new Classname();
		
	}

	
	
	
	
	
	
	
	
	

}
