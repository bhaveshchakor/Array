package week_6_Array;

import java.util.Arrays;

public class InsertionSort
{
	public static void main(String[] args)
	{
		int[] a = { 7, 4, 3, 2, 8, 1, 6, 5 };

		for (int i = 0; i < a.length; i++)
		{
			int j = i - 1;
			for (; j >= 0; j--)
			{
				if (a[j] < a[i])
				{
					break;
				}
			}
			int firstIndex = j + 1;
			int lastIndex = i;
			int temp = a[lastIndex];

			for (int k = lastIndex; k > firstIndex; k--)
			{
				a[k] = a[k - 1];
			}
			a[firstIndex] = temp;
		}
		System.out.println(Arrays.toString(a));
		InsertionSort ob=new InsertionSort();
		ob.hashCode();
	}
}
