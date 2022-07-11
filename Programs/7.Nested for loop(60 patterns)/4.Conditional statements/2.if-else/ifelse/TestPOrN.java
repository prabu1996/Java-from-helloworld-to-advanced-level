import java.io.*;
class TestPOrN { 
	public static void main(String arg[]) {
		try{
			DataInputStream t=new DataInputStream(System.in);
			int num;
			System.out.println("enter num");
			num=Integer.parseInt(t.readLine());
			if (num>0)
			    System.out.println("positive number");
			else if (num==0)
			     System.out.println("neutral number");
			else
			      System.out.println("negative number");
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}