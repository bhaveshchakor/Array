package week_6_Array;

class Student
{
	int rollno;
	String name;
	int marks;

	public Student(int rollno, String name, int marks)
	{
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}
	public Student()
	{
		super();
;	}
}

public class ArrayOfObjects 
{
	public static void main(String[] args)
	{
		Student s1 = new Student(1, "Amol", 67);
		Student s2 = new Student(2, "Bhavesh", 55);
		Student s3 = new Student(3, "Chetan", 49);
		Student s4 = new Student(4, "Kiran", 72);

		Student[] a = { s1, s2, s3, s4 };
		int max = Integer.MIN_VALUE;
		Student maxStudent = null;

		for (int i = 0; i < a.length; i++)
		{
			if (a[i].marks > max)
			{
				max = a[i].marks;
				maxStudent = a[i];

			}
		}
		System.out.println(maxStudent.rollno+" "+maxStudent.name+" "+maxStudent.marks);
		System.out.println(max);

	}
}
