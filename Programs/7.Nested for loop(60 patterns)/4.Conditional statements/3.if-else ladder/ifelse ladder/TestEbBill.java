import java.io.*;
class TestEbBill
{
	public static void main(String arg[])
	{
		try{
			DataInputStream t=new DataInputStream(System.in);
			String X,Y;
			System.out.println("name");
			X=t.readLine();
			System.out.println("customer_id");
			Y=t.readLine();
			double Z,cost,a,b;
			b=0;
			a=0;
			System.out.println("consumption");
			Z=Double.parseDouble(t.readLine());
			if((Z>0)&&(Z<=199))
			{
				cost=(Z*1.20);
			}
			else if((Z>=200)&&(Z<=399))
			{
				a=(199.0*1.20);
				b=(Z-199);
				cost=(b*1.50)+(a);
			}
			else if((Z>=400)&&(Z<=599))
			{	
				a=(199*1.20);
				b=(Z-399); 
				cost=a+(200*1.5)+(b*1.80);
			}
			else 
				cost=(b*2.0)+(a)+(200*1.5)+(200*1.8);
			if (cost>=400)
				cost+=(0.15*cost);
			else if (cost<100)
			{
				cost=100;
			System.out.println("Total cost= "+cost);
			}
	
		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}