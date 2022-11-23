package week_5_ArraynOop;

public class ArRemoveElement
{
	public static void main(String[] args)
	{
		int[] a = { 33, 78, 90, 20, 5, 50, 40};
		int ele = 33;
		int[] b = new int[a.length];

		for (int i = 0; i < a.length; i++)
		{
			if (a[i] != ele)
			{
				b[i] = a[i];
				System.out.print(b[i] + " ");
			}
		}
		System.out.println("length: "+(b.length-1));

	}
}
/* 33 90 20 5 50 40 */