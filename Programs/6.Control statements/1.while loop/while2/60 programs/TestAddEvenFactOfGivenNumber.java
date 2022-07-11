import java.io.*;
class TestAddEvenFactOfGivenNumber
{
	static public void main(String[] args)
	{
		try
		{
			DataInputStream t=new DataInputStream(System.in);
			int Input;
			double Output,a,b,c,d;
			Output=0;
			a=1;
			b=1;
			c=1;
			d=1;
			System.out.println("Input");
			Input=Integer.parseInt(t.readLine());
			while(a<=Input)
			{
				if(a%2==0)
				{
					b=(a*b*d);
					//System.out.println(b);
					c=1/b;
					Output+=c;
					//System.out.println(Output);		
				}
				else
					d=a;
				a++;
			}
			System.out.println(Output);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}