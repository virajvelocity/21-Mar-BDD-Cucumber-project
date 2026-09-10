package Variables;

public class Sample2 
{
	public static void main(String[] args) 
	{
		//Step-(1) Variable declaration	
			String	StudentName;             //Datatype Variablename
			int	StudentRollNo;				//Datatype Variablename
			float StudentPercentage;  		//Datatype Variablename
            char StudentGrade;   			//Datatype Variablename
			
		//Step-(2) Variable initialization/Assignment
			StudentName="Rohit";
			StudentRollNo=101;
			StudentPercentage=70.48f;
			StudentGrade='A';
			
		//Step-(3) Variable Usage
			System.out.println("Name of Student: " + StudentName);   //Rohit
			System.out.println("Roll no of Student: " + StudentRollNo);  //101
			System.out.println("Percentage of Student: " + StudentPercentage + "%"); //70.48
			System.out.println("Grade of Student: " + StudentGrade);  //A
	}	
}







