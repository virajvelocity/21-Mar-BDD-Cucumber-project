package Loops;

public class Demo12 
{

	// print both Even and Odd Nos from 1 to 10   //Odd-->1 3 5 7 9   Even-->2 4 6 8 10
	public static void main(String[] args) 
	{
		
		//1 2 3 4 5 6 7 8 9 10      
		
		      //i=1      //1<=10      //2 
		                 //2<=10      //3
		                 //3<=10      //4
		                 //4<=10     //5
		                //5<=10      //6
		                //6<=10      //7
		                //7<=10      //8
		                //8<=10      //9
		                //9<=10       //10
		               //10<=10       //11
		               //11<=10
		for(int i=1;      i<=10;      i++)    
		{
			 //0 == 0  -->true
			if(i % 2 == 0)   
			{
				System.out.println(i + ": is an Even No");  //2 4  6  8  10      //10%2=0
			}
			else 
			{
				System.out.println(i + ": is an Odd no");  //1  3  5  7 9
			}
			
		}
		
		
	}
		
	
}
