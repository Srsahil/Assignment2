package program;
import java.util.Scanner; 

public class Student {
	String name ;
	String email ;
	long  phone;
	String address;
	String status;
	
	public  Student(String sname,String semail,long sphone ,String sadress,String sstatus)
	{
		name=sname;
		email=semail;
		phone=sphone;
		address=sadress;
		status=sstatus;
	}
	
	public void display(){
	      System.out.println("Name: "+name);
	      System.out.println("email: "+email);
	      System.out.println("phone: "+phone);
	      
	      
	          System.out.println("Address: "+ address);
	          System.out.println("status: "+status);
	          
	     
	   }

	public static void main(String[] args) {
		int number;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total number of student ");
		 number=sc.nextInt();
		 Student st[] = new Student[number+1];
		 for(int i=1;i<=number;i++)
		 {
		System.out.println("Enter the name of student ");
				
				String name=sc.next();
System.out.println("Enter the email of student ");
				
				String email=sc.next();
System.out.println("Enter the phone of student ");
				
				int phone=sc.nextInt();
System.out.println("Enter the address of student ");
				
				String address=sc.next();

System.out.println("Enter the status of student ");
				
				String status=sc.next();
				st[i]=new Student(name,email,phone,address,status);
		
}
		 System.out.println("Please Enter which student details you want  ");
			
			int  result=sc.nextInt();
			st[result].display();
			
			sc.close();

}
}
