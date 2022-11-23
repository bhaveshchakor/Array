package week_5_ArraynOop;

public class ArReverse
{
	public static void main(String[] args)
	{
		int[] a = { 1,2,3,4,5 };
		int i = 0;
		int j = a.length - 1;
		
		System.out.println("Before reverse: ");
		for (int j2 = 0; j2 < a.length; j2++)
		{
			System.out.print(a[j2]+" ");
		}
		
		while (i < j)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
			i++;
			j--;
		}
		System.out.println("\n"+"After reverse: ");
		for (int j2 = 0; j2 < a.length; j2++)
		{
			System.out.print(a[j2]+" ");
		}
	}
}
/*
Before reverse: 
4 1 5 7 9 
After reverse: 
9 7 5 1 4
*/