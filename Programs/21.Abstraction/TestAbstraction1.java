abstract class Shape
{
	abstract public void draw();
}
class Rectangle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing rectangle");
	}
}
class Circle extends Shape
{
	public void draw()
	{
		System.out.println("Drawing circle");
	}	
}
class TestAbstraction1
{
	public static void main(String arg[])
	{
		//Shape obj=new Shape(); abstract class cannot be instantiazed
		Shape obj=new Circle();
		Shape t1=new Rectangle();
		t1.draw();
		obj.draw();
	} 
}