//declaration by first user
interface Drawable //interface is a blueprint of class.so i replaced class keyword by interface
{
	void draw();
}
// implementation by second user
class Rectangle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing rectangle");
	}
}
class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("Drawing circle");
	}
}
class Interface1
{
	public static void main(String arg[])
	{
		Drawable obj;
		obj=new Rectangle();
		obj.draw();
		obj=new Circle();
		obj.draw();	
	}
}