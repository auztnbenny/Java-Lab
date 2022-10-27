/**
 * title:display elements of a matrix
 * created by :Austin**/

import java.util.Scanner;
public class displaymatrix {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int row,column,elements,matrix[][];
		System.out.println("enter the order of matrix");
		row=in.nextInt();
		column=in.nextInt();
		System.out.println("enter the elements of the matrix");
		matrix=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				matrix[i][j]=in.nextInt();
			}
		}
		System.out.println("entered matrix is");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(matrix[i][j]);
				System.out.print("\t");
	
		}System.out.print("\n");
		
		
	}


	}
	}
