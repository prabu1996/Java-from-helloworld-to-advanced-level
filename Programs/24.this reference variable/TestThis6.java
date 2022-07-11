//study well

class TestThis6
{
	public void method1(TestThis6 obj)
	{
		System.out.println("Method 1 is invoked");
	}
	public void method2()
	{
		method1(this);
	}
	public static void main(String arg[])
	{
		TestThis6 t1=new TestThis6();
		t1.method2();
	}
}