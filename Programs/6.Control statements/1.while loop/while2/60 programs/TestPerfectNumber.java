import java.io.*;
class TestPerfectNumber
{
	static public void main(String arg[])
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int Input,Output,a,b;
			System.out.println("Input your number");
			Input=Integer.parseInt(t.readLine());
			a=Input;
			b=1;
			Output=0;
			if ((Input%2!=0) || (Input==0))
				System.out.println("Not a perfect number");
			else if (Input%2==0)
			{	
				while(a>1)
				{
					if(Input%a==0)
					{
						b=(Input/a);
						Output+=b;
						//System.out.println(Output);
					}
					a--;
				}
				if(Output==Input)
					System.out.println("perfect number");
				else
					System.out.println("non-perfect number");
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}