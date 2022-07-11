class TestExceptionPropogation2
	public void m()
	{
		throw new java.io.IOException("Device error"); //checked exception
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
		TestExceptionPropogation2 obj=new TestExceptionPropogation2();
		obj.p();
		System.out.println("Normal flow");
	}
}


// checked exceptions i propagation panna mudiyaadhu..So compile time error varum