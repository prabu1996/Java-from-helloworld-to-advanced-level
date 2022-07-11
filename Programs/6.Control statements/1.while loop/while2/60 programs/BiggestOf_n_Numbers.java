import java.io.DataInputStream;
class BiggestOf_n_Numbers
{
	public static void main(String arg[])
	{
	try
	{
		DataInputStream t=new DataInputStream(System.in);
		int Student1,Student2,Student3;
		System.out.println("Mark of Student1=");
		Student1=Integer.parseInt(t.readLine());
		System.out.println("Mark of Student2=");
		Student2=Integer.parseInt(t.readLine());
		int n=3;
		Student3=0;
		//System.out.println("c=");
		//int c=Integer.parseInt(t.readLine());
		while (n<=10)
		{
			if(Student1>=Student2)
			{
				System.out.println("Mark of Student"+n+"=");
				Student3=Integer.parseInt(t.readLine());
				Student2=Student3;
			}	
			else if (Student2>=Student1)
			{	
				Student2=Student1;
				System.out.println("Mark of Student"+n+"=");
				Student3=Integer.parseInt(t.readLine());
				Student1=Student3;
			}
			n++;	
		}
		System.out.println("Highest mark is ="+Student1);
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
}