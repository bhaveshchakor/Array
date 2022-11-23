package week_6_Array;

public class Saddle_Point
{
	public static void main(String[] args)
	{
		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int cnt = 0;

		// for row
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a[i].length; j++)
			{
				boolean smallInRow = true;
				for (int k = 0; k < a.length; k++)
				{
					if (a[i][j] > a[i][k])
					{
						smallInRow = false;
					}
				}

				boolean largeInCol = true;
				for (int k = 0; k < a.length; k++)
				{
					if (a[i][j] < a[k][j])
					{
						largeInCol = false;
					}
				}
				if (smallInRow && largeInCol)
				{
					System.out.println(a[i][j]);
					cnt++;
				}
			}
		}
		if (cnt==0)
		{
			System.out.println("no saddle point");
		}
	}
}