import java.util.*;

abstract class Shape {
	int length, breadth, radius;
	Scanner input = new Scanner(System.in);

	abstract void printArea();

}

class Rectangle8 extends Shape {
	void printArea() {
		System.out.println("\nFinding the Area of Rectangle\n\n");
		System.out.print("Enter length and breadth: ");
		length = input.nextInt();
		breadth = input.nextInt();
		System.out.println("The area of Rectangle is: " + length * breadth);
	}
}

class Triangle extends Shape {
	void printArea() {
		System.out.println("\nFinding the Area of Triangle\n\n");
		System.out.print("Enter Base And Height: ");
		length = input.nextInt();
		breadth = input.nextInt();
		System.out.println("The area of Triangle is: " + (length * breadth) / 2);
	}
}

class Cricle extends Shape {
	void printArea() {
		System.out.println("\nFinding the Area of Cricle\n\n");
		System.out.print("Enter Radius: ");
		radius = input.nextInt();
		System.out.println("The area of Cricle is: " + 3.14f * radius * radius);
	}
}

public class AbstractSample {
	public static void main(String[] args) {
		Rectangle8 rec = new Rectangle8();
		rec.printArea();

		Triangle tri = new Triangle();
		tri.printArea();
		
		Cricle cri = new Cricle();
		cri.printArea();
	}
}