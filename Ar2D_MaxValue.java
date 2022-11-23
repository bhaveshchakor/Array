package week_6_Array;

public class Ar2D_MaxValue
{
	public static void main(String[] args)
	{
		int[][] a = { { 1, 12, 3 }, { 4, 5, 6 }, { 7, 8, 27 } };
		int max = 0;

		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				if (a[i][j] > max)// comparing each element with max element
				{
					max = a[i][j];
				}
			}
		}
		System.out.println(max);
	}
}
/* 27 */