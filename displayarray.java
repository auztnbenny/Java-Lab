/**
 * Title:DISPLAY ARRAY ELEMENTS
 * Created by:Austin Benny
 * **/

import java.util.Scanner;
public class displayarray{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int array[],size;
		System.out.println("enter the size of array");
		size=in.nextInt();
		System.out.println("enter the elements");
		array=new int [size];
		for (int i=0;i<size;i++)
				{
					array[i]=in.nextInt();
				}
		System.out.println("array entered is");
		for(int i=0;i<size;i++)
		{
			System.out.println(array[i]);
		}
		
	}

}