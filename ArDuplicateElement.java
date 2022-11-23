package week_5_ArraynOop;

public class ArDuplicateElement
{
	public static void main(String[] args)
	{
		int a[] = { 1, 5, 3, 6, 3, 2, 4, 6, 5, 3, 4, 5, 7, 8, 9, 4 };
		//	we'll check 1 element with element all the element ahead of it
		int uniqueCnt = 0;
		for (int i = 0; i < a.length; i++)
		{
			int cnt = 0;
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] == a[j])
				{
					cnt++;
					break;
				}
			}
			if (cnt == 0)
			{
				uniqueCnt++;
			}
		}
		System.out.println("Array length w/o duplicate: " + uniqueCnt);
	}
}
/* Array length w/o duplicate: 9
*/