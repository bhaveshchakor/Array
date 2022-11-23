package week_6_Array;

class Demo
{

	static int[] a = new int[4];
	static int index = 0;

	static void print()
	{

		for (int i = 0; i < index; i++)
		{
			System.out.println(a[i] + " ");
		}
	}
	static void push(int num)
	{

		if (index < a.length)
		{
			a[index++] = num;
		} else
		{
			System.out.println("Stack Overflow");
		}
	}
	static int pop()
	{
		if (index == 0)
		{
			System.out.println("Stack Empty");
			return 0;
		} else
		{
			index--;
			return a[index];
		}

	}
}

public class StackDemo
{
	public static void main(String[] args)
	{
		Demo.push(10);
		Demo.push(20);
		Demo.push(30);
		Demo.push(40);
//		Demo.push(50);
		

//		Demo.print();
		System.out.println(Demo.pop());
		System.out.println(Demo.pop());
		System.out.println(Demo.pop());
		System.out.println(Demo.pop());
		System.out.println(Demo.pop());

	}
}
