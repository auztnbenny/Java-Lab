class Base
{
	int length;
	Base(int l)
	{
		length=l;
	}
	void print()
	{
		System.out.println(length);
	}
}
class Base2 extends Base
{
	int breadth;
	Base2(int l,int b)
	{	
		super(l);
		breadth=b;
	}
	void printBase2()
	{
		System.out.println("length="+length+",breadth="+breadth);
	}
}


public class Sample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Base obj=new Base(10);
		
		//bj.print();
		Base2 obj2=new Base2(20,10);
		obj2.printBase2();
		
	}

}
