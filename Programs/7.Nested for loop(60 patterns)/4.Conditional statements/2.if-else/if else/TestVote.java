import java.io.*;
class TestVote {
	public static void main(String arg[]) { 
		try{
			DataInputStream t=new DataInputStream(System.in);
			int age;
			System.out.println("enter your age");
			age=Integer.parseInt(t.readLine());
			if (age>=18)
				System.out.println("Eligible to vote");
			else
				System.out.println("Not eligible to vote");
		}
		catch (Exception e) {
			System.out.println(e);
		}
			
	}
}