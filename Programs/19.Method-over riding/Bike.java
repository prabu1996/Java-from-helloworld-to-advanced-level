//program1
//Java Program to demonstrate why we need method overriding  
class Vehicle
{
	public void run()
	{
		System.out.println("Vehicle is running");
	}
}
class Bike extends Vehicle
{
	public static void main(String arg[])
	{
		Bike obj=new Bike();
		//Vehicle obj=new Bike();
		//Vehicle obj=new Vehicle();
		obj.run();
	}
}