package week_6_Array;

public class SumAvg_SubArray
{
	public static void main(String[] args)
	{
		int[] a = { 3, 7, 90, 20, 5, 50, 40 };
		int SubArrSIze = 3;
		int min = Integer.MAX_VALUE;
		int index=0;
		for (int i = 0; i < a.length - SubArrSIze; i++)
		{
			int sum = 0;
			for (int j = i; j < i + SubArrSIze; j++)
			{
				sum = sum + a[j];
			}
			int avg = sum / SubArrSIze;
			if (avg < min)
			{
				min=avg;
				index=i;
			}
		}
		System.out.println("Average: "+min);
		System.out.println("Index: "+index);

	}
}
