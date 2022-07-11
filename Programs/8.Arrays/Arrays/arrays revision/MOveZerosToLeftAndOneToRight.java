class MOveZerosToLeftAndOneToRight
{
	public static void main(String arg[])
	{
		int n,i,x,y,z;
		int[] a={0,2,1,0,0,5,7,1,0,5};
		n=a.length;
		x=0;
		y=0;
		int[] b=new int[n];
		for(i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				x+=1;		
			}
			else if(a[i]==1)
			{
				y+=1;	
			}			
		}
		//System.out.println("x="+x);
		//System.out.println("y="+y);
		for(i=0;i<x;i++)
		{
			b[i]=0;
			System.out.print(b[i]);
		}
		for(i=n-1;i>=n-y;i--)
		{
			b[i]=1;
			System.out.print(b[i]);
		}
		z=n-(x+y);
		for(i=0;i<n;i++)
		{
			if((a[i]!=0)&&(a[i]!=1))
			{
				b[x-1]=a[i];
				x++;
				System.out.print(b[x-1]);
			}
		}
	}
}