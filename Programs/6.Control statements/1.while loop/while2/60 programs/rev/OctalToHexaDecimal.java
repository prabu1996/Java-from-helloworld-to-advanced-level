import java.io.*;
class OctalToHexaDecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("enter octal number");
			int oct=Integer.parseInt(t.readLine());
			String x=String.valueOf(oct);
			int len=x.length();
			int i=0;
			int d=0;
			while(i<len)
			{
				char a=x.charAt(i);
				if(a==48)
					d=d*8;
				else if(a==49)
					d=d*8+1;
				else if(a==50)
					d=d*8+2;
				else if(a==51)
					d=d*8+3;
				else if(a==52)
					d=d*8+4;
				else if(a==53)
					d=d*8+5;
				else if(a==54)
					d=d*8+6;
				else 
					d=d*8+7;
				i++;
			}
			System.out.println(d);
			String hex="";
			while(d>0)
			{
				int y=d%16;
				if(y==10)
					hex="A"+hex;
				else if(y==11)
					hex="B"+hex;
				else if(y==12)
					hex="C"+hex;
				else if(y==13)
					hex="D"+hex;
				else if(y==14)
					hex="E"+hex;
				else if(y==15)
					hex="F"+hex;
				else 
					hex=String.valueOf(y)+hex;

				d=d/16;	
			}
			System.out.println(hex);
		}	
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}