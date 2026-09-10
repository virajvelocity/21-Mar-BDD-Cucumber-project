package Basic;

public class Test1 
{
	public static void main(String[] args) 
	{
		//Upcasting : Employee does not know about approveLeave()
		Employee emp= new Manager();
		emp.work();
		emp.attandMeetings();
		
		//Downcasting :	
		Manager	mgr = (Manager) emp;
		mgr.work();
		mgr.attandMeetings();
		mgr.approveLeave();
		
	}
	
	
	
	
	
	
	
	
}
