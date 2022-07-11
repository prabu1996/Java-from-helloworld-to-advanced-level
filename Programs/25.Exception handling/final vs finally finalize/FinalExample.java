class FinalExample
{
	final int age=55;
	public void display()
	{
		age=88;
	}
	public static void main(String arg[])
	{
		FinalExample obj=new FinalExample();
		obj.display();
	}
}