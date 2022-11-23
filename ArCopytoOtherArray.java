package week_5_ArraynOop;

public class ArCopytoOtherArray
{
	public static void main(String[] args)
	{
		int[] a = { 10, 5, 4, 1, 7, 9 };
		int[] b = new int[a.length];

		for (int i = 0; i < b.length; i++)
		{
			b[i] = a[i];
		}
		for (int i = 0; i < b.length; i++)
		{
			System.out.print(b[i] + " ");
		}
	}
}
