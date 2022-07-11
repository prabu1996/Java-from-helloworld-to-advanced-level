import java.io.*;
class BinaryToDecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("binary number");
			String bin=t.readLine();
			int len=bin.length();
			System.out.println(len);
			int i=0;
			int d=0;  
			while(i<len)
			{

				char a=bin.charAt(i);
				if(a==1)
					d=(d*2)+1;
				else if(a==0)
					d=(d*2);
				i++;
						
			}
			System.out.println(d);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}