class Bank
{
	public int getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	public int getRateOfInterest()
	{
		return 7;
	}
}
class ICICI extends Bank
{
	public int getRateOfInterest()
	{
		return 8;
	}
}
class Test3
{
	public static void main(String arg[])
	{
		Bank obj1=new Bank();
		System.out.println(obj1.getRateOfInterest());
		SBI obj2=new SBI();
		System.out.println(obj2.getRateOfInterest());
		ICICI obj3=new ICICI();
		System.out.println(obj3.getRateOfInterest()) ;	
	}
}