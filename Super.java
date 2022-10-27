import java.util.*;
class Employee
{
	int b,d,h;
	void display()
	{
		System.out.println("Name of Class is Employee");
	}
	void calcSalary(int s,int a,int r)
	{
		b=s;
		d=a;
		h=r;
		
		System.out.println("Gross Salary of Employee is "+(b+(b*d/100)+(b*h/100)));
	}
}
class Engineer extends Employee
{ int b,d,h;
void calcSalary(int s,int a,int r)
	{
		super.display();
		super.calcSalary(s,a,r);
		b=s;
		d=a;
		h=r;
System.out.println("Name of Class is Engineer");
		
		System.out.println("Gross Salary of Engineer is "+2*(b+(b*d/100)+(b*h/100)));
		}
	}
public class Super {
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	int bsa,da,hra;
	Engineer ob=new Engineer();
	System.out.println("Enter the basic salary of Employee");
	bsa=in.nextInt();
	System.out.println("Enter the DA of Employee");
	da=in.nextInt();
	System.out.println("Enter the HRA of Employee");
	hra=in.nextInt();
	ob.calcSalary(bsa,da,hra);
     } 
    }