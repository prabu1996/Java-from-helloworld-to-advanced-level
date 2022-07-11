abstract class Bank
{
	abstract int getRateOfInterest();
}
class SBI extends Bank
{
	public int getRateOfInterest()
	{
		return(7);
	}
}
class Axis extends Bank
{
	public int getRateOfInterest()
	{
		return(8);
	}
}
class TestBank
{
	public static void main(String arg[])
	{
		Bank obj;
		obj=new SBI(); 
		System.out.println("Rate of Interest is"+obj.getRateOfInterest()+"%");	
		obj=new Axis();
		System.out.println("Rate of Interest is"+obj.getRateOfInterest()+"%");		
	}
}