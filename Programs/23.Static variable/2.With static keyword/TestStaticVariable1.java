class Student
{
	String name;
	int roll_No; //instance variable
	static String college="GCT"; //static variable
	//constructor
	Student(String n,int r)
	{
		name=n;
		roll_No=r;
	}
	//method
	public void display()
	{
		System.out.println(roll_No+" "+name+" "+college);
	}
}
class TestStaticVariable1
{
	public static void main(String arg[])
	{
		Student s1=new Student("Prabu",2072411);
		Student s2=new Student("Anuth",2072401);
		// we can change entire student's college name in a single line of code
		//Student.college="Scad";
		s1.display();
		s2.display();
		
	}	
}