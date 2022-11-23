package week_5_ArraynOop;

public class ArrayConcept
{
	public static void main(String[] args)
	{
		int[] arr = { 10, 20, 30, 40 };
		// Method 1 to print each element

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);

		// method 2 to print each element
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		// method 3 to print each element
		for (int i : arr)
		{
			System.out.println(i);
		}
	}
}
