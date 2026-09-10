package TypeCasting;

public class Test1 
{
	
	//Type Casting : Process of converting one data type into another datatype
	//Type Casting : 1) Implicit Casting(Automatically-By default)  2) Explicit Casting(Manually)
	
	
	//1) Implicit Casting/Widening Casting/Upcasting(By default)
	

	 public static void main(String[] args) 
	 {
		//Example-1:  int to double
		 
		 int num = 50;                   //4 bytes
		 System.out.println(num);        //50
		 
		double d=num;      //8 bytes=4 bytes
		System.out.println(d);//50.0
		
		
		//Example-2:  int to long
		
		int num1=100;     //4 byte
		System.out.println(num1);  //100
		
		long value=num1;   //100l      //8 bytes=4 bytes
		System.out.println(value);  //100
		
	}
	  
	
	

}
