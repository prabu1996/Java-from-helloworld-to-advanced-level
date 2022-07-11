public abstract class AbstractReceipe 
{
	public void exceute()
	{
		getReady();
		doTheDish();
		Cleanup();
	}
	//abstract void getReady();
	//abstract void doTheDish();
	//abstract void Cleanup();
}
class Receipe1 extends AbstractReceipe
{
	void getReady()
	{
		System.out.println("Get the raw materials");
		System.out.println("Get the utensils");
	}
	void doTheDish()
	{
		System.out.println("Get the stuff ready");
		System.out.println("Put it in the microwave");
	}
	void Cleanup()
	{
		System.out.println("Clean the utensils");
	}
} 
public class ReceipeRunner
{
	public static void main(String arg[])
	{
		Receipe1 t1=new Receipe();
		t1.exceute();
	}
} 