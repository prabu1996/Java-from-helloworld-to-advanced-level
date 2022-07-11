class B
{
	TestThis7 obj;
	B(TestThis7 obj)
	{
		this.obj=obj;
	}
	public void display()
	{
		System.out.println(obj.data);
	}
}
class TestThis7
{
	int data=10;
	TestThis7()
	{
		B t2=new B(this);
		t2.display();
	}
	public static void main(String arg[])
	{
		TestThis7 t1=new TestThis7();
		
	}
}