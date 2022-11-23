package week_5_ArraynOop;

public class ArLargestSmallestElement
{
	public static void main(String[] args)
	{
		int[] arr = { 6, 2, 1, 7, 5, 9 };
		int max = 0;
		int min = arr[0];

		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > max)
			{
				max = arr[i];
			}
			if (arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("Largest element in the array is: " + max);
		System.out.println("Smallest element in the array is: " + min);
	}
}
