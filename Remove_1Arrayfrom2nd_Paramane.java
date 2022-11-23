package week_6_Array;

import java.util.Arrays;

public class Remove_1Arrayfrom2nd_Paramane
{
	public static void main(String[] args)
	{
		int[] a = { 1, 1, 1, 1, 1, 2, 2, 3, 4, 4, 4 };
		int[] n = { 1, 2, 4 };
		for (int j = 0; j < n.length; j++)
		{
			int num = n[j];
			int count = getCount(a, num);
			int[] b = new int[a.length - count];
			int index = 0;
			int removed = 0;
			for (int i = 0; i < a.length; i++)
			{
				if (removed >= 2 || a[i] != num)
					b[index++] = a[i];
				else
				{
					removed++;
				}
			}
			a = b;
		}
		System.out.println(Arrays.toString(a));
	}

	private static int getCount(int[] a, int num)
	{
		int count = 0;

		for (int ele : a)
		{
			if (ele==num)
			{
				count++;
			}
		}
		if (count>2)
		{
			count=2;
		}
		return count;
	}
}
