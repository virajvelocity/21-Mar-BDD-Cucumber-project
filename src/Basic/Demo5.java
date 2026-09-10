package Basic;

public class Demo5 
{

	public static void main(String[] args) 
	{	
		int a=50;
		int b=60;	
		int c=900;
		int d=1000;		
			
		System.out.println(a>b && a<b);  // false && true-->false
		System.out.println(c>a && d>a);
		
		System.out.println(a>b || a<b);  // false || true--->true
		System.out.println(c<a && d>a);
		
		System.out.println(!(a>b));  //true
		
		System.out.println(!(a<b));  //false

		String result=(a<b)? "A" :"B";
		System.out.println(result);
		
		
			      //i=2     //2<=8   i=4
			                //4<=8   i=6
			                //6<=8   i=8
			                //8<=8   i=10
			                //10<=8
			for(int i=2;     i<=8;   i+=2) 
			{
				System.out.println(i);  //2  4  6  8
			}
			
			
			
		}

		
		
	}
	
	

