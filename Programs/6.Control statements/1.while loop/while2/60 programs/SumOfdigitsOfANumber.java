import java.io.*;
class SumOfdigitsOfANumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			String number;
			System.out.println("input number=");
			number=t.readLine();
			int output,i;
			char x = number.charAt(0);
			x++;
			System.out.println(x);
			i=0;
			output=0;
			//while(i<(x.length()))
			//{
			//	output=output+(x.charAt(i));
			//	System.out.println(output);
			//	i++;
			//}
			//System.out.println(output);	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}