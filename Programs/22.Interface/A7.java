interface Printable
{
	void print();
}
interface Showable
{
	void show();
}
class A7 implements Showable,Printable 
{
	public void print()
	{
		System.out.println("Hello");
	}
	public void show()
	{
		System.out.println("Welcome");
	}
	public static void main(String arg[])
	{
		A7 obj=new A7();
		obj.print();
		obj.show();
	}
}