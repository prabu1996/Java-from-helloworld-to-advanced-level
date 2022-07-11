import java.io.*;
class BinaryToOctal
{
		public static void main(String arg[])
		{
			try
			{
				DataInputStream t=new DataInputStream(System.in);
				System.out.println("Binary code");
				String b=t.readLine();
				int d=b.length();
				int e=d/3;
				int i=0;
				String oct="";
				int a=1000;
				int f=Integer.parseInt(b);
				int rev=0;
				while(i<e)
				{
					int r=f%a;
					if(r==0)
						oct+="0";
					else if(r==1)
						oct+="1";
					else if(r==10)
						oct+="2";
					else if(r==11)
						oct+="3";	
					else if(r==100)
						oct+="4";	
					else if(r==101)
						oct+="5";	
					else if(r==110)
						oct+="6";
					else if(r==111)
						oct+="7";	
					i++;
					f=f/a;		
				}
				int z=Integer.parseInt(oct);
				while(z>0)
				{
					int rem=z%10;
					rev=(rev*10)+rem;
					z=z/10;
				}
				System.out.println(rev);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
}