import java.util.*;
class Student
{
	int rollno,age;
	String name;
	public Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
class Test1
{
	public static void main(String arg[])
	{
		Student t1=new Student(01,"Anuth",25);
		Student t2=new Student(02,"Gokhul",25);
		Student t3=new Student(03,"Mani",27);
		ArrayList<Student> list=new ArrayList<Student>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.forEach(a->{System.out.println(a.rollno+" "+a.name+" "+a.age);});
	}
}