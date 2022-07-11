abstract class AbstractCooking
{
	abstract void Step1();
	abstract void Step2();
	abstract void SecretReceipe();
	
} 
class Receipe extends AbstractCooking
{
	public void Step1()
	{
		System.out.println("Wash the utensils");
		System.out.println("Get all the required raw materials in one place");
	}
	public void Step2()
	{
		System.out.println("Wash the vegetables");
		System.out.println("Start to cook");
	}
	public void SecretReceipe()
	{
		System.out.println("Add some sugar for extra taste");
	}
	public void display()
	{
		System.out.println("Wash all the plates and start eating");
	}
}
class MainClass
{
	public static void main(String arg[])
	{
		Receipe t1=new Receipe();
		t1.Step1();
		t1.Step2();
		t1.SecretReceipe();
		t1.display();			
	}
}