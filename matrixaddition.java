/**
 * title:addition of two matrix
 * created by:austin**/

import java.util.Scanner;
public class matrixaddition {
	public static void main(String[] args)
	{
		Scanner in= new Scanner(System.in);
		int matrix1[][],row,column,matrix2[][],sum[][];
		System.out.println("enter the order of matrix 1");
		row=in.nextInt();
		column=in.nextInt();
		System.out.println("enter the elements of matrix 1");
		matrix1=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				matrix1[i][j]=in.nextInt();
			}
		}
		System.out.println("enter the elements of matrix 2");
		matrix2=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				matrix2[i][j]=in.nextInt();
			}
		}
		System.out.println("sum of matrix is");
		sum=new int [row][column];
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				sum[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				System.out.print(sum[i][j]);
				System.out.print("\t");
			}System.out.print("\n");
		}
		
		
		
		
	}

}
