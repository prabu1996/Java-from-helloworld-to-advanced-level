import java.io.*;
class HexaDecimalToBinary1
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter hexadecimal number");
			String x=t.readLine();
			int len=x.length();
			int i=0;
			int value=0;
			int n;
			while(i<len)
			{
				char c=x.charAt(i);
				if(c=='A')
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

				value=(value*16)+n;
				i++;
			}
			//System.out.println(value);
			int z=1,rem;
			int ans=0;
			while(value>0)
			{
				rem=value%2;
				ans=(rem*z)+ans;
				value=value/2;
				z=z*10;	
				System.out.println(ans);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}