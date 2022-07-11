// example of abstract class with abstract method
abstract class Bike
{
	abstract public void run();	
}
class Honda extends Bike
{
	public void run()
	{
		System.out.println("Running safely");
	}
	public static void main(String arg[])
	{
		Bike t1=new Honda();
		t1.run(); 		
	}
}