class Student
{
	int rollno;
	String name;
	static String college="ITS";
	Student(int r,String n)
	{
		rollno=r;
		name=n;
	}
	public static void change() //static method to change the value of static variable
	{		
		college="BBDIT";	
	}
	public void display()
	{
		System.out.println(rollno+" "+name+" "+college);
	}
}
class TestStaticMethod
{
	public static void main (String arg[])
	{
		Student.change();
		Student c1=new Student(2071411,"Prabu");
		Student c2=new Student(2072401,"Anuth");
		Student c3=new Student(2072402,"Gokhul");
		c1.display();	
		c2.display();
		c3.display();
	}
}