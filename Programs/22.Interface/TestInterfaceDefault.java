interface Drawable
{
	void draw();
	default void msg()
	{
		System.out.println("Default method");
	}
}
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing rectangle");	
	}
}
class TestInterfaceDefault
{
	public static void main(String arg[])
	{
		Rectangle obj=new Rectangle();
		obj.draw();
		obj.msg();
	}
}