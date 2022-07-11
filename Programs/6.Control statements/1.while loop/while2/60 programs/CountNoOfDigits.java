import java.io.DataInputStream;
class CountNoOfDigits
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int Length;
			String number;
			System.out.println("number?");
			number=t.readLine();
			Length=number.length();
			System.out.println(Length);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
