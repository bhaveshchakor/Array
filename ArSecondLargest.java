package week_5_ArraynOop;

public class ArSecondLargest
{
public static void main(String[] args)
{
	int []a= {45,22,15,87,65,59};
	int firstMax=0;
	int secondMax=0;
	
	
	for (int i = 0; i < a.length; i++)
	{
		if (a[i]>firstMax) // It will check element is greater than firstmax element 
		{
			
			secondMax=firstMax;
			firstMax=a[i];
			
		}
		if (a[i]>secondMax && a[i]!=firstMax) // 
		{
			secondMax=a[i];
		}
	}
	System.out.println("First largest element is: "+firstMax);
	System.out.println("Second largest element is: "+secondMax);
	
}
}
/*
First largest element is: 87
Second largest element is: 65
 */