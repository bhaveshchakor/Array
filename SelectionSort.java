package week_6_Array;

import java.util.Arrays;

public class SelectionSort
{
	public static void main(String[] args)
	{

		int[] a = { 4, 9, 2, 8, 3, 7, 1, 6, 5 };

		for (int i = 0; i < a.length; i++)
		{
			int index = i;
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[index]>a[j])
				{
					index = j;
				}
			}
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;
		}

		System.out.println(Arrays.toString(a));

	}
}
/*
 * [1, 2, 3, 4, 5, 6, 7, 8, 9]
 */