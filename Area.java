class Rectangle
{
	
	void printArea(int length,int breadth)
	{
		System.out.println ("area of rectangle"+length*breadth);
	}
	void printArea(float radius)
	
	{
		System.out.println("area of circle is"+(3.14*radius*radius));
	}
	void printArea(double len,float height)
	{
		System.out.println("area of triangle is"+0.5*len*height);
	}
	
}
public class Area {
public static void main(String [] args)
{
	Rectangle recArea=new Rectangle();
	recArea.printArea(10,20);
	recArea.printArea(10);
	recArea.printArea(10,20);
	
}
}