package week_6_Array;

public class Ar2D_MinValue
{
	public static void main(String[] args)
	{
		int[][] a = { { 1, 12, 3 }, { 4, 5, 6 }, { 7, 8, 27 } };
		int min = a[0][0];
		
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if (a[i][j]<min)
				{
					min=a[i][j];
				}
			}
		}
		System.out.println("Min: "+min);
	}
}
/*output
Min: 1
*/