package week_5_ArraynOop;

public class ArEvenOdd
{
	public static void main(String[] args)
	{
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int evencnt = 0; // 1st we need to calculate how many even numbers to set size of array

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] % 2 == 0)
			{
				evencnt++;
			}
		}
		int[] evenAr = new int[evencnt]; // created array with size of even no
		int[] oddAr = new int[a.length - evencnt]; // created array with size of odd no

		int evenIndex = 0;
		int oddIndex = 0;

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] % 2 == 0) // checking the even odd condition
			{
				evenAr[evenIndex] = a[i]; 	// assigned even no in even array
				evenIndex++;				// increased index for position of new element	
			} else
			{
				oddAr[oddIndex] = a[i];		// assigned odd no in even array
				oddIndex++;					// increased index for position of new element	
			}
		}
		System.out.println("Even array:");
		for (int i = 0; i < evenAr.length; i++)
		{
			System.out.print(evenAr[i] + " ");
		}
		System.out.println("\n"+"Odd array:");
		for (int i = 0; i < oddAr.length; i++)
		{
			System.out.print(oddAr[i] + " ");
		}

	}
}
/*
 * Even array:
2 4 6 8 
Odd array:
1 3 5 7 9
*/
