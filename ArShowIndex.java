package week_5_ArraynOop;

public class ArShowIndex
{
	public static void main(String[] args)
	{
		int[] ar = { 1,6,2,3,4,5,6,7};
		int ele = 6;
		int cnt = 0;
		for (int i = 0; i < ar.length; i++)
		{
			
			if (ar[i] == ele)
			{
				System.out.println(i);
				cnt++;
				break;// because of this break it will compare from index 0 to 5 and as soon as it match 1st with 1st element it will break
				// so it will show only 1 match
			}
		}
		if(cnt==0) {System.out.println(ele+" Not Found");}
	}
}
