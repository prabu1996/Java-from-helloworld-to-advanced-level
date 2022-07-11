import java.io.*;
class TestCitizen { 
	public static void main(String arg[]) {
		try{
			DataInputStream t=new DataInputStream(System.in);
			int age;
			System.out.println("tell me your age");
			age=Integer.parseInt(t.readLine());
			if (age<18)
			   System.out.println("you are a child");
			else if ((age>=18)&&(age<60))
			   System.out.println("you are an adult");
			else 
			   System.out.println("you are a senior citizen");
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}