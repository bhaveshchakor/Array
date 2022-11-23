package week_6_Array;
// Array & its 2 element is given. find difference between two element at index level 
public class ArrayDifference
{

	public static void main(String[] args)
	{
		int[] a = { 1,2,3,4,5,6 };
		int m = 1, n = 4;
		int mIndex = 0, nIndex = 0;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == m)
			{
				mIndex = i;
				break;
			}
		}
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] == n)
			{
				nIndex = i;
				break;
			}
		}
		System.out.println("Difference: "+(nIndex-mIndex));
	}

}
/*Difference: 3
*/