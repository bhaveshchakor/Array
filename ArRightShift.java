package week_5_ArraynOop;

public class ArRightShift
{
	public static void main(String[] args)
	{
		int[] a = { 11, 22, 33, 44, 55, 66 };
		
		int firstIndex=0;
		int lastIndex=a.length - 1;
		int temp = a[lastIndex];

		
		for (int i = lastIndex; i > firstIndex; i--)
		{
			a[i] = a[i - 1];
		}
		a[firstIndex] = temp;
		System.out.println("Array after right shift: ");
		for (int i = 0; i < lastIndex; i++)
		{
			System.out.print(a[i] + " ");
		}
	}
}
/*
 * Array after right shift: 66 11 22 33 44 55
 */