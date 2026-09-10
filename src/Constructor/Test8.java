package Constructor;

public class Test8
{

	Test8()
	{
		this(10);
	}
	         //10
	Test8(int a)
	{
		this("virat");
		System.out.println(a);  //10
		System.out.println("Hi");  //Hi
		
	}
	
	Test8(String Sname)
	{
		
	}
	
	public static void main(String[] args) 
	{
		Test8 T8=new Test8();	
	}
	
	
	
	
}
