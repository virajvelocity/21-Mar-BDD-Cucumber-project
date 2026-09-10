package Array;

public class Sample1 
{
	
	public static void main(String[] args) 
	{
		
		//Step-1: Array Declaration  + Array Initilisation/Assignment
		                   //0     //1     //2      //3      //4
		 String[]  Str1= {"Rohit","Virat","Rahul","Hardik","Ravindra"}; 
		
		 
		 //Size/Length of an Array
		 System.out.println("Length/Size of an array: "+ Str1.length);  //5
		 
		 //last index of an array
		 System.out.println("Last index of an array: " + (Str1.length-1)); //5-1=4   //size/length-1=last index
		 
		 
		//Step-3: Usage
		 
		      //i=0      //0<=4                  1
		                 //1<=4                  2
		                 //2<=4                  3
		                //3<=4                   4
		                //4<=4                   5
		                //5<=4
		for(int i=0;      i<=Str1.length-1;    i++) 
		{
			                       //4
			System.out.println(Str1[i]); //Str[4]  //Rohit  Virat  Rahul  Hardik  Ravindra
			
		}
		 
		 
	}
	
	
	
	
	

}
