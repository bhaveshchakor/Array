package week_6_Array;

import java.util.Arrays;

// store 1st element of s1 then 1st element of s2 in s3.
public class InterleavingArray
{
	public static void main(String[] args)
	{
		char[] a = { 'a', 'b', 'c', 'd','e','f'};
		char[] b = {'w', 'x', 'y', 'z' };
		char[] c = new char[a.length + b.length];
		int index = 0;
		for (int i = 0;i<a.length || i<b.length; i++) // Instead of i<a.length || i<b.length can write i<c.length
		{
			if (i < a.length)
			{
				c[index++] = a[i];
			}
			if (i < b.length)
			{
				c[index++] = b[i];
			}

		
		}
		System.out.println(Arrays.toString(c));	
	}
}
/* a w b x c y d z e f g  */