import java.io.*;
class TestArithmetic1 { 
	public static void main(String arg[]) {
		try{
			DataInputStream t=new DataInputStream(System.in);
			int x,y,z,input;
			System.out.println("enter x");
			x=Integer.parseInt(t.readLine());
			System.out.println("enter y");
			y=Integer.parseInt(t.readLine());
			System.out.println("What operation u want to perform");
			input=Integer.parseInt(t.readLine());
			if (input==1) 
			{	
				z=x+y;	
			      	System.out.println("addition of x&y is = "+z );
			}
			else if (input==2) 
			{
				z=x-y;
			   	System.out.println("subtraction of x&y is "+z);
			}
			else if (input==3) 
			{
				z=(x*y);
			   	System.out.println("Multiplication of x&y is= "+z);
			}
			else if (input==4) 
			{
				z=(x/y);
				System.out.println("Division of x&y is= "+z);
			}
			else if (input==5) 
			{
				z=(x%y);
				System.out.println("Reminder of x&y is= "+z);
			}
			else 
				System.out.println("give valid input");
		}

		catch (Exception e) {
			System.out.println(e);
		}
	}
}