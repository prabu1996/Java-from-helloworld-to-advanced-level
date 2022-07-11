class TestExceptionPropogation1
{
	public void m()
	{
		int data=50/0;
	}
	public void n()
	{
		m();
	}
	public void p()
	{
		try
		{
			n();	
		}
		catch(Exception e)
		{
			System.out.println("Exception handled");
		}
	}
	public static void main(String arg[])
	{
		TestExceptionPropogation1 obj=new TestExceptionPropogation1();
		obj.p();
		System.out.println("Normal flow");
	}
}