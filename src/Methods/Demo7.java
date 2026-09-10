package Methods;

public class Demo7 
{
	public static void main(String[] args) 
	{
		addition	();			//methodname();
		addition();			//methodname();	
		addition	(20,50);		//methodname();
	}
	
	//Static Regular Method--->Zero/without parameter method
	public static void addition() 
	{
		int a=10;
		int b=20;
		int Sum1=a+b;  //30
		System.out.println(Sum1);//30
	}
		
	//Static Regular Method---> 2 int parameters method
	public static void addition(int c, int d) //int c=20, int d=50
	{
				int	Sum2=c+d;  //70
			System.out.println(Sum2);//70
			
	}
	
}
