import java.io.*;
class AddFactorialsOfNumbersBetGivenInput
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,f,T;
			System.out.println("number");
			n=Integer.parseInt(t.readLine());
			i=1;
			f=1;
			T=0;
			do
			{
				f=f*i;
				T=T+f;
				i++;
				System.out.println(T);
			}
			while(i<=n);
			//System.out.println(t);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}