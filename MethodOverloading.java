import java.util.Scanner;
class Display
{
    void area(double s)
    {System.out.println("Area of Circle ="+(3.14*s*s));
    }
    void area(int a,int b)
    {System.out.println("Area of Rectangle ="+(a*b));}
    void area(float c,float d)
    {System.out.println("Area of Triangle ="+(0.5*c*d));}
}
public class MethodOverloading{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Display d1=new Display();
        int i,j;
        double u;
        float m,n;
        System.out.println("Enter the radius of Circle : ");
        u=sc.nextDouble();
        System.out.println("Enter the length of Rectangle : ");
        i=sc.nextInt();
        System.out.println("Enter the breadth of Rectangle : ");
        j=sc.nextInt();
        System.out.println("Enter the height of Triangle : ");
        m=sc.nextFloat();
        System.out.println("Enter the breadth of Triangle : ");
        n=sc.nextFloat();
        d1.area(u);
        d1.area(i,j);
        d1.area(m,n);
    }
}