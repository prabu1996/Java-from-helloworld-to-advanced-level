import java.io.*;
class DecimalToHexaDecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("Decimal number");
			int n=Integer.parseInt(t.readLine());
			String temp="";
			while(n>0)
			{
				int r=n%16;
				if(r==10)
					temp="A"+temp;
				else if(r==11)
					temp="B"+temp;
				else if(r==12)
					temp="C"+temp;
				else if(r==13)
					temp="D"+temp;
				else if(r==14)
					temp="E"+temp;
				else if(r==15)
					temp="F"+temp;	
				else 
					temp=String.valueOf(r)+temp;
				n/=16;			
			}
			System.out.println(temp);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}