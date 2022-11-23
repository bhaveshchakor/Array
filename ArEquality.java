package week_5_ArraynOop;

public class ArEquality
{
	public static void main(String[] args)
	{
		int[] a = { 10, 20, 30, 40, 50 };
		int[] b = { 10, 20, 30, 40, 50 };
		if (a.length == b.length)
		{
			int cnt = 0;
			for (int i = 0; i < b.length; i++)
			{
				if (a[i] != b[i])
				{
					cnt++;
					break;
				}
			}
			if (cnt == 0)
			{
				System.out.println("Array equal !");
			} else
			{
				System.out.println("Not equal!");
			}
		} else
		{
			System.out.println("Array size is not same");
		}
	}
}
// Array equal ! 