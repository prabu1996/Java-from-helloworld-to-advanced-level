class A
{
	
	A getA()
	{
		return this;
	}
	public void msg()
	{	
		System.out.println("Hello World");
	}
}
class TestThis8
{
	public static void main(String arg[])
	{
		//A t2=new A();
		new A().getA().msg();
		
	}
}