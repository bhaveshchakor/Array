package week_6_Array;

public class Ar2D_SumofTwo2DArray
{
	public static void main(String[] args)
	{
		int[][] a = { { 1, 12, 3 }, { 4, 5, 6 }, { 7, 8, 27 } };
		int[][] b = { { 1, 12, 3 }, { 4, 5, 6 }, { 7, 8, 27 } };

		int[][] c = new int[a.length][a[0].length];
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}
}
/* Output
2 24 6 
8 10 12 
14 16 54 
*/