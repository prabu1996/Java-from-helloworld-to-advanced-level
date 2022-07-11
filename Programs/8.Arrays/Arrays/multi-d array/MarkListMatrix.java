import java.io.*;
class MarkListMatrix
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int i,j;
			String p;
			int[][]a=new int[4][3];
			String[] b=new String[4];
			String[] c=new String[4];
			p="";
			for(i=0;i<4;i++)
			{
				System.out.println("heading row");
				b[i]=t.readLine();
			}
			for(i=0;i<4;i++)
			{
				System.out.println("heading column");
				c[i]=t.readLine();
			}
			for(i=0;i<4;i++)
			{
				for(j=0;j<3;j++)
				{
					System.out.println("marks");
					a[i][j]=Integer.parseInt(t.readLine());
				}
			}
			for(i=0;i<4;i++)
			{
				System.out.print(b[i]+"  ");
			}
			System.out.println("");
			for(i=0;i<4;i++)
			{
				for(j=0;j<3;j++)
				{
					p=p+String.valueOf(a[i][j])+" ";
				}
				System.out.println(c[i]+" "+p);
			}
					
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}