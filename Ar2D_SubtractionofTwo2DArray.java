package week_6_Array;

public class Ar2D_SubtractionofTwo2DArray
{
	public static void main(String[] args)
	{
		int[][] a = { { 5, 12, 3 }, { 14, 5, 6 }, { 7, 8, 27 } };
		int[][] b = { { 1, 8, 1 }, { 6, 3, 3 }, { 1, 3, 13 } };

		int[][] c = new int[a.length][a[0].length];
		for (int i = 0; i < c.length; i++)
		{
			for (int j = 0; j < c.length; j++)
			{
				c[i][j] = a[i][j] - b[i][j];
			}
		}
//		for (int i = 0; i < c.length; i++)
//		{
//			for (int j = 0; j < c.length; j++)
//			{
//				System.out.print(c[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		for (int[]is : c)
		{
			for (int is2 : is)
			{
				System.out.print(is2+" ");
			}
			System.out.println();
		}

	}
}
/* Output
4 4 2 
8 2 3 
6 5 14  
*/