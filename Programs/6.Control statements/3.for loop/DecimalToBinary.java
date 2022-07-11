import java.io.*;
class DecimalToBinary
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t1=new DataInputStream(System.in);
			int dec,i,rem;
			String bin="";
			System.out.println("Enter decimal number");
			dec=Integer.parseInt(t1.readLine());
			for(;dec>0;)
			{
				rem=dec%2;
				bin=rem+bin;
				dec=dec/2;
			}
			System.out.println("Equivalent binary code="+bin);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}