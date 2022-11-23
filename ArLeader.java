package week_5_ArraynOop;

public class ArLeader
{
	public static void main(String[] args)
	{
		int[] a = { 11, 22, 66, 44, 40 };
		

		for (int i = 0; i < a.length; i++)
		{
			int cnt = 0;
			for (int j = i + 1; j < a.length; j++)
			{
				if (a[i] < a[j]) // All the element on right side are smaller than our comparing element
				{
					cnt++;
					break;
				}
			}
		
			if (cnt==0)
			{
				System.out.println(a[i]);
			}
		}

	}
}
/*
66
44
40
*/