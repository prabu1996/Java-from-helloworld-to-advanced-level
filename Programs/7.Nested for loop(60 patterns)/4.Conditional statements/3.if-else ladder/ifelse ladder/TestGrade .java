import java.io.*;
class TestGrade 
{
	public static void main(String arg[])
	{
		try{
			DataInputStream t=new DataInputStream(System.in);
			int Grade;
			System.out.println("Enter your Grade");
			Grade=Integer.parseInt(t.readLine());
			if (Grade==E)
			  System.out.println("Excellent");
			else if (Grade==V)
			  System.out.println("Very good");
			else
			  System.out.println("check your input");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}	
	} 
}