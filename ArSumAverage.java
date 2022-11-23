package week_5_ArraynOop;

public class ArSumAverage
{
	public static void main(String[] args)
	{
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int sum = 0;
		for (int i = 0; i < a.length; i++)
		{
			sum = sum + a[i]; // each element is extracted and added in sum
		}
		System.out.println("Sum: " + sum);
		double avg = sum / a.length; // a.length is nothing but a total no of element in array
		System.out.println("Average: " + avg);
	}
}

/*
 * Sum: 28 Average: 4.0
 */