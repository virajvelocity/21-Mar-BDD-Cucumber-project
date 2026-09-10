package Datatypes;

public class Test2 
{
	public static void main(String[] args) 
	{	
		//Step-(1) Variable declaration	
			byte a;    	//1 byte
			short b;  	 //2 bytes
			int c;  		//4 bytes
			long d;	    //8 byte
			float e;  	//4 byte
			double g;  	//8 byte
			char h;   //2 bytes
			boolean i;  //1 bit
			boolean j;   //1 bit
			String U;
			
		//Step-(2) Variable initialization/Assignment		
			a=100;    		//  Stores whole numbers from -128 to 127	
			b=5000; 		 	//Stores whole numbers from -32,768 to 32,767	
			c=500000;  		//Stores whole numbers from -2,147,483,648 to 2,147,483,647
			d=987654321065l;  // Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
			e=164.24567894f;
			g=164.245678941234;
			h='K';
			i=true;		
			j=false;	
	U="The fees are reasonable compared to other institutes in Pune, and the quality of training is superior. S. Sanket Deshpande,100";
			
		//Step-(3) Variable Usage
			System.out.println(a);  //100
			System.out.println(b); //5000
			System.out.println(c); //500000
			System.out.println(d); //987654321065
			System.out.println(e); //164.24567894
			System.out.println(g);  //164.245678941234	
			System.out.println(h);//K
			System.out.println(i);  //true
			System.out.println(j);  //false
			System.out.println(U);  //The fees are reasonable compared to other institutes in Pune, and the quality of training is superior. S. Sanket Deshpande
	}
	
		
}
