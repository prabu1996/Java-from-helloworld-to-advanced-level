class A
{
	public void method1()
	{
		System.out.println("Invoking method1");
	}		
	public void method2()
	{
		System.out.println("Invoking method2");
		this.method1();
		//method1();
	}
}
class TestThis2
{
	public static void main(String arg[])
	{
		A t1=new A();
		t1.method2();
		//t1.method1();
	}
}