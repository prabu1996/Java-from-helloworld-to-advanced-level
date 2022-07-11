interface Bank
{
	double rateOfInterest(); //no other methods than abstract method allowed in interface class
}
class SBI implements Bank
{
	public double rateOfInterest()
	{
		return(9.15);
	}
}
class Axis implements Bank
{
	public double rateOfInterest()
	{
		return(9.7);
	}
}
class TestInterface2
{
	public static void main(String arg[])
	{
		Bank obj;
		obj=new SBI();
		System.out.println("ROI:"+obj.rateOfInterest());
		obj=new Axis();
		System.out.println("ROI:"+obj.rateOfInterest());				
	}
}