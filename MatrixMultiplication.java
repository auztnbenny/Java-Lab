/**
 * title:multiplication of two matrix
 * created by:austin**/

import java.util.Scanner;
public class MatrixMultiplication {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int matrix1[][],matrix2[][],row1,column1,row2,column2,matrix3[][];
		System.out.println("enter the order of matrix 1");
		row1=in.nextInt();
		column1=in.nextInt();
		System.out.println("enter the order of matrix 2");
		row2=in.nextInt();
		column2=in.nextInt();
		if(column1==row2)
		{
			System.out.println("enter the matrix1");
			matrix1=new int[row1][column1];
			for (int i=0;i<row1;i++)
			{
				for(int j=0;j<column1;j++)
				{
					matrix1[i][j]=in.nextInt();
				}
			}
			System.out.println("enter the matrix2");
			matrix2=new int[row2][column2];
			for (int i=0;i<row1;i++)
			{
				for(int j=0;j<column2;j++)
				{
					matrix2[i][j]=in.nextInt();
				}
			}
			System.out.println("resultant matrix is");
			matrix3=new int [row1][column2];
			for (int i=0;i<row1;i++)
			{
				for(int j=0;j<column1;j++)
				{
					for(int k=0;k<row2;k++)
					{
						matrix3[i][j]=matrix3[i][j]+(matrix2[i][k]*matrix1[k][j]);
					}
				}
			}
			for (int i=0;i<row1;i++)
			{
				for(int j=0;j<column1;j++)
				{
					System.out.print(matrix3[i][j]);
					System.out.print("\t");
					
				}System.out.println("\n");
			}
			
			
			
			
		}
		
	}

}
