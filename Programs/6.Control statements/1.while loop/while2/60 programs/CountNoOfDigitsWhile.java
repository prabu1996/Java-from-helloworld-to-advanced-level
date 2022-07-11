import java.io.DataInputStream;
class CountNoOfDigitsWhile
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int a,count;
			String number;
			System.out.println("number?");
			number=t.readLine();
			a=1;
			count=1;
			while(a<(number.length()))
			{
				count++;
				a++;
			}
			System.out.println(count);
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}
}
