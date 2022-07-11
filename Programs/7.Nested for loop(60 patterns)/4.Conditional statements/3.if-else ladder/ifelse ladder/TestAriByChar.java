import java.io.*;
class TestAriByChar {
	public static void main(String arg[]){
		try{
			DataInputStream t=new DataInputStream(System.in);
			String operation;
			System.out.println("operation");
			operation=t.readLine();
			char input;
			input=operation.charAt(0);
			int x,y,z;
			System.out.println("enter x");
			x=Integer.parseInt(t.readLine());
			System.out.println("enter y");
			y=Integer.parseInt(t.readLine());
			if (input=='+')
			{
			  z=(x+y);
			  System.out.println("sum of x&y is.."+z);
			}
			else if (input=='-')
			{
			  z=(x-y);
			  System.out.println("sub of x&y is..."+z);
			}
			else if (input=='*')
			{
			  z=(x*y);
			  System.out.println("mult of x&y is ...."+z);
			}
			else if (input=='/')
			{
			  z=(x/y);
			  System.out.println("div of x&y is ...."+z);
			}
			else if (input=='%')
			{
			  z=(x%y);
			  System.out.println("Remainder of x&y is ...."+z);
			}
			else
			   System.out.println("need to check for error");
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
			
			
			

			 
