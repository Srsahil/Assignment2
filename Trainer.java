package program;
public class Trainer {
	String name;
	String department;
	String email;
	int id;
	public Trainer(String empname,String empdepartment,String empemail,int empid){
		name=empname;
		department=empdepartment;
		email=empemail;
		id=empid;
		}
	public static void main(String[] args) {
		Trainer Trainer1=new Trainer("Mukesh", "Testing", "mukesh@gmail.com", 1);
		Trainer Trainer2=new Trainer("Hitesh", "Dev", "mukesh@gmail.com", 2);
		Trainer Trainer3=new Trainer("Mukesh", "DevOps", "mukesh@gmail.com", 3);
		Trainer1.Selenium();
		Trainer2.Web_Development();
		Trainer3.DevOps();

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
