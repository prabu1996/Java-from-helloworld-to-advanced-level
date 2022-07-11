//If there is ambiguity between the instance variables and parameters, this keyword resolves the problem of ambiguity.
//we use same name for instance variables and parameters in real time
class Student
{
	int rollno; //Instance variables
	String name;
	float fee;
	Student(int rollno,String name,float fee) //parameter
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;	
	}
	public void display()
	{
		System.out.println(name+" "+rollno+" "+"fee");
	}
}
class TestThis1
{
	public static void main(String arg[])
	{
		Student s1=new Student(2072401,"Anuth",10500f);	
		Student s2=new Student(2072402,"Gokhu",60000f);
		s1.display();		
		s2.display();
	}
}