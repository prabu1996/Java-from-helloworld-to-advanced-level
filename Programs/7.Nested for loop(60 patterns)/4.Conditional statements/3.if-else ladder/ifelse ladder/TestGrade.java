 import java.io.*;
class TestGrade 
{
	public static void main(String arg[])
	{
		try{
			DataInputStream t=new DataInputStream(System.in);
			String Grade;
			System.out.println("Enter your Grade");
			Grade=t.readLine();
			char h=Grade.charAt (0);
			if (h=='E')
			  System.out.println("Excellent");
			else if (h=='V')
			  System.out.println("Very good");
			else
			  System.out.println("check your input ");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}	
	} 
}