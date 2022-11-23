package week_5_ArraynOop;

public class ArFindElement
{
public static void main(String[] args)
{
	int[]a= {45,22,15,87,65,59};
	int searchEle=15;
	int index=0;
	int cnt=0;
	
	for (int i = 0; i < a.length; i++)
	{
		if (a[i]==searchEle)
		{
			index=i;
			cnt++;
			break;
			
		}
	}
	if (cnt==0)
	{
		System.out.println("Not found");
	}
	else {
		System.out.println("Found at: "+index);
	}
}
}
/* Found at: 2 */