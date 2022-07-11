abstract class Bike
{
	public Bike()
	{
		System.out.println("Bike is created");
	}
	abstract public void run();
	public void changeGear()
	{
		System.out.println("Gear changed");
	}
}
class Honda extends Bike
{
	public void run()
	{
		System.out.println("Running safely");
	}
}
class TestAbstraction2
{
	public static void main(String arg[])
	{
		Bike obj=new Honda();
		obj.run();
		obj.changeGear();
	}
}