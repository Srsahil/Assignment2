package program;
public class Task2 {
	String name;
	String department;
	String email;
	int id;
	public Task2(String empname,String empdepartment,String empemail,int empid){
		name=empname;
		department=empdepartment;
		email=empemail;
		id=empid;
		}
	public static void main(String[] args) {
		
		Task2 trainer[] = new Task2[4];
	      //Populating the array
		trainer[0] = new Task2("Mukesh", "Testing","mukesh@gamil.com",1);
		trainer[1] = new Task2("Hitesh", "Dev", "mukesh@gmail.com", 2);
		trainer[2] = new Task2("Mukesh", "DevOps", "mukesh@gmail.com", 3);	      
		
		
		
		
		trainer[0].Selenium();
		trainer[1].Web_Development();
		trainer[2].DevOps();
		

	} 
	public void Selenium()
	{
		System.out.println("Trainer1 can teach Selenium with name-> "+name+" department = "+department+" and email id="+email+" employee id= "+id);
		
	}
	public void Web_Development()
	{
		System.out.println("Trainer2 can teach Web_Dev with name-> "+name+" department = "+department+" and email id="+email+" employee id= "+id);
		
	}
	public void DevOps()
	{
		System.out.println("Trainer3 can teach Devops with name-> "+name+" department = "+department+" and email id="+email+" employee id= "+id);
		
	}
	}
