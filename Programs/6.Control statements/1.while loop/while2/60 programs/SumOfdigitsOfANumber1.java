import java.io.*;
class ProductOfdigitsOfANumber
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int num,output,y,i,z;
			System.out.println("enter your number");
			num=Integer.parseInt(t.readLine());
			output=0;
			i=0;
			z=num;
			String x=String.valueOf(num);
			y=x.length();
			while(i<y)
			{
				output+=z%10;
				z/=10;
				i++;		
			}
			System.out.println(output);

		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}