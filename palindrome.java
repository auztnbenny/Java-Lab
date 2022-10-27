import java.util.Scanner;
public class palindrome {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		StringBuffer str1;
		StringBuffer str2;
		int n,length,i;
		System.out.println("enter the string");
		str1=new StringBuffer();
		str1=str1.append(in.nextLine());
		str2=new StringBuffer();
		length=str1.length();
		for (i=length-1;i>=0;i--)
		{
			str2=str2.append(str1.charAt(i));
		}
		System.out.println("the reverse of your string is "+ str2);
		n=str2.compareTo(str1);
		if(n==0)
			System.out.println("the string is palindrome");
		else
			System.out.println("the string is not palindrome");
		}
	

}
