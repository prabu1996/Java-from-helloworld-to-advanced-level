
class MOveZerosToLeftAndOneToRight1
{
	public static void main(String arg[])
	{
		int[] a={10,2,1,0,2,0,1,0,22,5};
		int i,n,x,y,z,e,f,g;
		x=0;
		y=0;
		z=0;
		n=a.length;
		int[] b=new int[n];
		for(i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				x+=1;;		
			}
			else if(a[i]==1)
			{
				y+=1;
			}
			else 
				z+=1;
		}
		e=n-(x+y+z);
		g=n-(x+y);
		f=x+g;
		for(i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				b[e]=a[i];
				e++;
			}
			else if(a[i]>1)
			{
				b[x]=b[i];
				x++;
			}
			else if(a[i]==1)
			{
				b[f]=a[i];
				f++;
			}		
		}
		for(i=0;i<n;i++)
		{
			System.out.print(b[i]);
		}
	}
}