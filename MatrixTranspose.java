/**
 * title:transpose of matrix
 * created by:austin**/

import java.util.Scanner;
public class MatrixTranspose {
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		int matrix[][],row,column,transpose[][];
		System.out.println("enter the order of matrix");
		row=in.nextInt();
		column=in.nextInt();
		System.out.println("enter the elements");
		matrix=new int[row][column];
		for(int i=0;i<row;i++)
		{
			for (int j=0;j<column;j++)
			{
				matrix[i][j]=in.nextInt();
			}
		}
		System.out.println("transpose matrix is");
		transpose=new int[column][row];
		for (int i=0;i<column;i++)
		{
			for (int j=0;j<row;j++)
			{
				transpose[i][j]=matrix[j][i];
				System.out.print(transpose[i][j]);
				System.out.print("\t");
			}System.out.println();
		}
		
		
		
	}

}
