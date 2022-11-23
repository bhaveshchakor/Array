package week_5_ArraynOop;

public class ArBinarySearch
{
	public static void main(String[] args)
	{
		int[] a = { 12, 13, 14, 15, 16, 17, 18, 19 };
		int element = 17;
		int first = 0;
		int last = a.length - 1;
		int mid = (first + last) / 2;

		while (first <= last)
		{
			if (element == a[mid])
			{
				System.out.println("Element Found at: " + mid);
				break;
			} else if (element > a[mid])
			{
				first = mid + 1;
			} else
			{
				last = mid - 1;
			}
			mid = (first + last) / 2;
		}
		if (first > last)
		{
			System.out.println("Element Not found");
		}
	}
}
/* Element Found at: 5 */
