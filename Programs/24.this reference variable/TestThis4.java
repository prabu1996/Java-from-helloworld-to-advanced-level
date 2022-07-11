//Calling parameterized constructor from default constructor:

class A
{
	A()
	{
		this(5);
		System.out.println("Default constructor is called");	
	}
	A(int number)
	{
		System.out.println("Parameterized constructor is called and number="+number);
	}
}
class TestThis4
{
	public static void main(String arg[])
	{
		A t1=new A();	
	}
}