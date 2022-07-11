import java.io.*;
class TestStuGrade
{
	public static void main(String arg[])
	{
		try{
			DataInputStream t=new DataInputStream(System.in);
			int X;
			System.out.println("Marks scored");
			X=Integer.parseInt(t.readLine());
			if ((X>=90)&&(X<101))
				System.out.println("S GRADE");
			else if ((X>=80)&&(X<90))
				System.out.println("A GRADE");
			else if((X>=60)&&(X<80))
				System.out.println("B GRADE");
			else if (X<60)
				System.out.println("FAIL");
			else
				System.out.println("check input");

		}
		catch (Exception e)
		{
			System.out.println(e);
		}
	}

}