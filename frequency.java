import java.util.Scanner;
public class frequency {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		String str1;
		char ch;
		int length,count;
		count=0;
		System.out.println("enter the string");
		str1=new String();
		str1=in.nextLine();
		System.out.println("enter the character");
		ch=in.next().charAt(0);
		length=str1.length();
		for(int i=0;i<length;i++)
		{
			if(ch==str1.charAt(i))
			{
				count++;
			
			}
			
		}System.out.println("character repeats"+count);
	}

}
