package week_6_Array;

public class Multiplication_Matrix
{
	public static void main(String[] args)
	{
		int[][] a = { 
					{ 1, 2, 3 }, 
					{ 4, 5, 6 } };

		int[][] b = {	
						{ 1, 2 }, 
						{ 3, 4 }, 
						{ 5, 6 }, 
						};
		
		int[][] c=new int[2][2];
		
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				for (int k = 0; k < b.length; k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}
}
