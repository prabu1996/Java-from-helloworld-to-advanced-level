import java.io.*;
class RemoveDuplicateElement
{
	public static void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int[] a={2,3,4,5,2};
			int i,j,n,count,m,x,z,c,v;
			m=5;
			x=0;
			z=0;
			n=5;
			for(i=0;i<n-1;i++)
			{
				count=0;
				n=5;
				for(j=i+1;j<n;j++)
				{
					if(a[x]==a[j])
					{
						count+=1;		
					}
					else if(a[x]!=a[j])
					{
					
					}
				}
				if(count>=1)
					z=z+1;
				x++;	
			}
			v=(n-z);
			System.out.println("size of array after removing duplicates="+v);	
			int[] b=new int[v];
			for(i=0;i<z;i++)
			{
				for(j=i+1;j<z+1;j++)
				{
					for(k=)
					if(a[i]==a[j])
					{
						b[i]=a[i];
						i=i+1;	
					}
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}