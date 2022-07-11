class Student
{
	int rollno;
	String name,place;
	float fee;
	Student(int rollno,String name,String place)
	{
		this.rollno=rollno;
		this.name=name;
		this.place=place;	
	}
	Student(int rollno,String name,String place,float fee)
	{
		this(rollno,name,place);
		this.fee=fee;
	}
	public void display()
	{
		System.out.println(name+" "+rollno+" "+place+" "+fee);
	}
	
}
class TestThis5
{
	public static void main(String arg[])	
	{
		Student t1=new Student(2072411,"Anuth","Nagercoil");	
		Student t2=new Student(2072412,"Gokhul","Cuddalore",10000f);
		t1.display();
		t2.display();
	}
}