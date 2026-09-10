package Operators;

public class Demo5
{
	
	public static void main(String[] args) 
	{	
		//i)	Logical Operators returns boolean output
		//ii)	&& (AND): Both Values should be” true” then and then only output becomes “true”		
		//iii)	|| (OR):  At least One value should be “true” then and then only output becomes “true”			
		//iv)	!  (NOT):  Provides output which is exactly opposite of given input
	
		int a=50;
		int b=60;
		int c=900;
		int d=1000;
		
		
		System.out.println(a>b && a<b);  //50>60-->false  &&  50<60-->true    --->false
		System.out.println(c>=a && d>b);  //(900>50-->true OR 900=50-->false)-->true  &&  1000>60-->true---> true
		System.out.println(a>d && d<b);  //50>1000-->false &&  1000<60-->false---> false
		
		System.out.println(a>b || a<b);  //50>60-->false  ||  50<60-->true  --->true 
		System.out.println(c>a || d>b);  //900>50-->true ||  1000>60-->true---> true
		System.out.println(a>d || d<b);  //50>1000-->false ||  1000<60-->false---> false
		
		System.out.println(!(a>b));  //50>60-->false--->true	
		System.out.println(!(a<b));   //50<60-->true-->false
	}
	
		
	
}
