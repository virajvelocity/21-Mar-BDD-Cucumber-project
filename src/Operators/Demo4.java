package Operators;

public class Demo4 
{
	public static void main(String[] args) 
	{	
		//2) Relational/Comparison Operators: > , >=, <, <=, !=, ==
		//Relational/Comparison Operators returns boolean value/output-->true/false
		
				int a=50;
				int b=10;
		
		System.out.println(a>b);  //50>10-->true
		System.out.println(a<b);  //50<10-->false
		System.out.println(a>=b);  //(1) 50>10-->true  OR  (2)50=10-->false     -->true
		System.out.println(a<=b);  //(1) 50<10-->false   OR  (2) 50=10-->false  -->false	
		System.out.println(a!=b);  //50!=10-->true
		System.out.println(a==b);  //50==10-->false
		
			int c=50;
			int d=50;
			
		System.out.println(c>=d);  //(1)50>50-->false  OR  (2) 50=50-->true  -->true
		System.out.println(c<=d);  //(1) 50<50-->false  OR  (2) 50=50-->true  -->true
		System.out.println(c!=d);  //50!=50-->false
		System.out.println(c==d);  //50==50  -->true
		
		
	}
	
	

}
