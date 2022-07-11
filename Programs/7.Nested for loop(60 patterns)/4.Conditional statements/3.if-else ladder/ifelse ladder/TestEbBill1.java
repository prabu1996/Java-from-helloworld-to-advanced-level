import java.io.*;
class TestEbBill1
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
			double Z,cost;
			System.out.println("consumption");
			Z=Double.parseDouble(t.readLine());
			if(Z<200)
			{
				cost=(Z*1.20);
				System.out.println("total amount="+cost);
			}
			else 
				System.out.println("bill=100 rs");
				

		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}