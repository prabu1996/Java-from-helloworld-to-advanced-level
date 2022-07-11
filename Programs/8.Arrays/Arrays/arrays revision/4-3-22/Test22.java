import java.io.*;
class Test22
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int n,i,j,count,x;
			String[] a={"c","d","e","f","g"};
			String[] b={"e","o","u","c","t"}; 
			n=a.length;
			x=0;
			for(i=0;i<n;i++)
			{
				count=0;
				for(j=0;j<n;j++)
				{
					if(a[i]==b[j])
						count+=1;
					else 
						x++;
				}
				//System.out.println("x is"+x);
				if(count>0)
					System.out.println("common element bet two arrays is "+a[i]);
			}
			
			if(x==(n*n))
				System.out.println("No common elements bet two arrays of strings");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}