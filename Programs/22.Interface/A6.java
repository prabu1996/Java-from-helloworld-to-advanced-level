interface Printable
{
	void print(); //declaring interface method ,no need to enter public before void..during compile it will automatically enters public keyword
}
class A6 implements Printable
{
	public void print()
	{
		System.out.println("Hello World");
	}
	public static void main(String arg[])
	{
		A6 obj=new A6();
		obj.print();						
	}
}