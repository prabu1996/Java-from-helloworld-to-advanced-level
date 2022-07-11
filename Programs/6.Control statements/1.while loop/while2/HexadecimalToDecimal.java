import java.io.*;
class HexadecimalToDecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter hexadecimal value");
			String hex=t.readLine();
			int len=hex.length();
			int i=0;
			int n;
			int num=0;
			while(i<len)
			{
				char c=hex.charAt(i);
				if (c=='A')
					n=10;
				else if(c=='B')
					n=11;
				else if(c=='C')
					n=12;
				else if(c=='D')
					n=13;
				else if(c=='E')
					n=14;
				else if(c=='F')
					n=15;
				else
					n=Character.getNumericValue(c);
				num=n+num*16;
				i++;
				//System.out.println(num);
			}
			System.out.println(num);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}