import java.io.*;
class SumOfNNumbers
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,mark,sum,i;
			System.out.println("total no of subjects");
			n=Integer.parseInt(t.readLine());
			System.out.println("name of the students");
			String name=(t.readLine());
			i=1;
			sum=0;
			do
			{
				System.out.println("subject"+i+"mark=");
				mark=Integer.parseInt(t.readLine());
				sum=sum+mark;
				i++;
				//System.out.println(sum);
			}
			while(i<=n);
			System.out.println(name+"'s total marks="+sum);
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}