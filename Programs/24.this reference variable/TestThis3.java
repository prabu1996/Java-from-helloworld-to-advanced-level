//Calling default constructor from parameterized constructor:
class A
{
	A()
	{
		System.out.println("Default constructor");
	}
	A(int number)
	{
		this();
		System.out.println(number);	
	}
}
class TestThis3
{
	public static void main(String arg[])
	{
		A t1=new A(10);
	}	
}