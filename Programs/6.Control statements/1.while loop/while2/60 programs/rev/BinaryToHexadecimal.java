import java.io.*;
class BinaryToHexadecimal
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("binary number");
			String bin=t.readLine();
			int len=bin.length();
			if(len>4)
			{
				if(len%4!=0)
					len=(len%4)+1;
				else 
					len=len%4;
			}
			else 
				len=1;
			System.out.println(len);
			
			String hex="";
			int bina=Integer.parseInt(bin);
			while(len>1)
			{
				int rem=bina%10000;
				if(rem==0)
					hex="0"+hex;	
				else if(rem==1)
					hex="1"+hex;
				else if(rem==10)
					hex="2"+hex;	
				else if(rem==11)
					hex="3"+hex;
				else if(rem==100)
					hex="4"+hex;	
				else if(rem==101)
					hex="5"+hex;
				else if(rem==110)
					hex="6"+hex;	
				else if(rem==111)
					hex="7"+hex;
				else if(rem==1000)
					hex="8"+hex;	
				else if(rem==1001)
					hex="9"+hex;
				else if(rem==1010)
					hex="A"+hex;	
				else if(rem==1011)
					hex="B"+hex;
				else if(rem==1100)
					hex="C"+hex;	
				else if(rem==1101)
					hex="D"+hex;
				else if(rem==1110)
					hex="E"+hex;	
				else if(rem==1111)
					hex="F"+hex;
				else 
					hex=String.valueOf(rem)+hex;
				bina=bina/10000;
				len--;
				System.out.println(hex);
			}
			//System.out.println(hex);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}