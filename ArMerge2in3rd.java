package week_5_ArraynOop;

public class ArMerge2in3rd
{
	public static void main(String[] args)
	{
		int[] a = { 4, 1, 5, 7, 9 };
		int[] b = { 1, 6, 7, 2, 8 };
		int[] c = new int[a.length + b.length];
		int index = 0;

		for (int i = 0; i < a.length; i++)
		{
			c[index++] = a[i];

		}
		for (int i = 0; i < b.length; i++)
		{
			c[index++] = b[i];
		}
		for (int i = 0; i < c.length; i++)
		{
			System.out.print(c[i] + " ");
		}
	}
}
