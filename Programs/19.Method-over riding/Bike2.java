class Vehicle
{
	public void run()
	{
		System.out.println("Vehicle is running");
	}	
}
class Bike2 extends Vehicle
{
	public void run()	
	{
		System.out.println("Bike is running");
	}
	public static void main(String arg[])
	{
		Vehicle obj=new Vehicle();
		obj.run();
		Bike2 obj2=new Bike2();
		obj2.run();		
	}
}