import java.util.*;

 class Employee1
{
	String name,age,phnum,add,salary;
	void printsalary()
	{
		
		System.out.println(" Salary is= "+salary);
	}
	void display()
	{
		System.out.println(" Name = "+name);
		System.out.println(" age = "+age);
		System.out.println(" phone number = "+phnum);
		System.out.println(" Address = "+add);
	}
}
class officer extends Employee1
{
	String specialization;
	
}
class manager extends Employee1
{
	String department;
	
}
public class MultilevelInheritance {
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		officer off=new officer();
		manager ma=new manager();
		System.out.println("Name of officer");
        off.name=in.nextLine();
		System.out.println(" age of officer");
		off.age=in.nextLine();
		System.out.println(" phone number of officer");
		off.phnum=in.nextLine();
		System.out.println(" address of officer");
		off.add=in.nextLine();
		System.out.println(" salary of officer");
		off.salary=in.nextLine();
		System.out.println("Name of Manager");
		ma.name=in.nextLine();
		System.out.println(" age of Manager");
		ma.age=in.nextLine();
		System.out.println(" phone number of Manager");
		ma.phnum=in.nextLine();
		System.out.println(" address of Manager");
		ma.add=in.nextLine();
		System.out.println(" salary of Manager");
		ma.salary=in.nextLine();
		System.out.println("Enter the specialization of  officer");
		off.specialization=in.nextLine();
		System.out.println("Enter the department of manager");
		ma.department=in.nextLine();
		System.out.println("DETAILS OF OFFICER");
		off.display();
		off.printsalary();
		System.out.println("specialization of officer    is="+off.specialization);
		System.out.println("DETAILS OF MANAGER");
		ma.display();
		ma.printsalary();
		System.out.println("department  of manager is="+ma.department);
		
	}

}