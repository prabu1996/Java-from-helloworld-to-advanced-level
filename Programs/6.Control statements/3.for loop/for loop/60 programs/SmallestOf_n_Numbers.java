import java.io.*;
class SmallestOf_n_Numbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,mark,i,mark1;
			System.out.println("n value");
			n=Integer.parseInt(t.readLine());
			mark=100;//max acheivable mark is 100
			for(i=1; i<=n;i++)
			{
				System.out.println("Student"+i+"marks=");
				mark1=Integer.parseInt(t.readLine());
				if(mark1<=mark)
					mark=mark1;	
			}	
			System.out.println("Lowest mark is"+mark);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}