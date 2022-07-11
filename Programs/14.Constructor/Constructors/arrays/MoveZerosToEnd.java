class MoveZerosToEnd
{
	public MoveZerosToEnd()
	{

	}
	public static void main(String arg[])
	{
		//int[] a={10,0,20,0,30,0,40};
		//int[] a={0,0,0,10,0,20,30,0,40};
		int[] a={0,0,10,20,30,0,40,0};
		int len=a.length;
		//int count=0;
		for(int i=0;i<len;i++)
		{
			for(int j=0;j<len-1;j++)
			{
				if(a[j]==0)
				{
					int x=a[j+1];
					a[j+1]=0;
					a[j]=x;
					//count+=1;
				}
			}
		}
		for(int i=0;i<len;i++)
		{
			System.out.println("a["+i+"]="+a[i]);	
		}	
	}
}