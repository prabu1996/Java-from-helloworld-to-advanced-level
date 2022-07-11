import java.io.*;
class OctalToDecimal1
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("octal number");
			String oct=t.readLine();
			int len=oct.length();
			int i=0;
			int d=0;
			while(i<len)
			{
				char a=oct.charAt(i);
				if(a==48)
					d=(d*8);
				else if(a==49)	
					d=(d*8)+1;
				else if(a==50)	
					d=(d*8)+2;
				else if(a==51)	
					d=(d*8)+3;
				else if(a==52)	
					d=(d*8)+4;
				else if(a==53)	
					d=(d*8)+5;
				else if(a==54)	
					d=(d*8)+6;
				else if(a==55)	
					d=(d*8)+7;
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