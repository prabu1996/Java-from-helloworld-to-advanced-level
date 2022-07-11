import java.io.*;
class HCF
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			System.out.println("n1=");
			int n1=Integer.parseInt(t.readLine());
			System.out.println("n2");
			int n2=Integer.parseInt(t.readLine());
			int i=2;
			int d=1;
			while(n1>1)
			{
					if((n1%i==0)&&(n2%i!=0))
					{
						d*=i;
						n1/=i;
						n2/=i;
						System.out.println(d);
					}
					else 
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