class InvalidAgeException extends Exception
{
	public InvalidAgeException(String str)
	{
		super(str);
	}
}
class TestCustomException1
{
	public static void Validate(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Age is not valid to vote");
		}
		else
			System.out.println("Welcome to vote");
	}
	public static void main(String arg[])
	{
		try
		{
			Validate(13);
			//Validate(19);
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
			System.out.println("Caught the exception");
		}
		System.out.println("Rest of the code");
	}
}