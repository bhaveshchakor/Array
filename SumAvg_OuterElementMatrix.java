package week_6_Array;

public class SumAvg_OuterElementMatrix
{
	public static void main(String[] args)
	{
		int[][] a = {	{ 1, 2, 3, 4 }, 
						{ 4, 5, 6, 7 },
						{ 7, 8, 9, 2 },
						{ 3, 7, 2, 9 } };

		int sum = 0;
		int avg = 0;
		int counter = 0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				if (i == 0 || i == 3 || j == 0 || j == 3)
				{
					sum = sum + a[i][j];
					counter++;
				}
			}
		}
		avg = sum / counter;
		System.out.println(avg);

	}
}
