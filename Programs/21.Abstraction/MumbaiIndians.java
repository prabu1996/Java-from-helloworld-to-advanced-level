abstract class PlayingEleven
{
	public void squad()
	{
		batting();
		allRounders();
		bowling();	
	}
	abstract public void batting();
	abstract public void allRounders();
	abstract public void bowling();	
}
class Roles extends PlayingEleven
{
	public void batting()
	{
		System.out.println("Rohit");		
		System.out.println("Ishan");
		System.out.println("Sky");
	}
	public void allRounders()
	{
		System.out.println("Pollard");
		System.out.println("Tim David");
	}
	public void bowling()
	{
		System.out.println("Bumrah");
		System.out.println("Mayank");
	}
}
class MumbaiIndians
{
	public static void main(String arg[])
	{
		Roles t1=new Roles();
		//PlayingEleven t2=new PlayingEleven(); abstract class cannot be instantiated
		t1.squad();
	}	
}