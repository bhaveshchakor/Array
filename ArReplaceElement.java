package week_5_ArraynOop;

public class ArReplaceElement
{
	public static void main(String[] args)
	{
		int[] a = { 1, 0, 1, 1, 1, 0, 0, 1 };
		System.out.println("Before replacing: ");
		for (int i = 0; i < a.length; i++)
		{
			System.out.print(a[i]+" ");
			if (a[i] == 1) // ex 2:by changing 1 with 0 here all element will be 1
			{
				a[i] = 0;	// ex2; change 1 to 0's
			}
		}
		System.out.println("\n"+"After replacing 1 with 0's:");
		for (int i = 0; i < a.length; i++)
		{

			System.out.print(a[i]+" ");
		}
	}
}
/*
Before replacing: 
1 0 1 1 1 0 0 1 
After replacing 1 with 0's:
0 0 0 0 0 0 0 0 
*/