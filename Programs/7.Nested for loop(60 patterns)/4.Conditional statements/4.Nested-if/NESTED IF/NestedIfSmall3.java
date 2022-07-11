import java.io.DataInputStream;
class NestedIfSmall3
{
	public static void main(String arg[])
	{
	  try
	  {
	    DataInputStream t=new DataInputStream(System.in);
	    int a,b,c;
	    System.out.println("enter a");
	    a=Integer.parseInt(t.readLine());
	    System.out.println("enter b");
	    b=Integer.parseInt(t.readLine());
	    System.out.println("enter c"); 
	    c=Integer.parseInt(t.readLine());
	    if (a<b)
	    {
	      if (a<c)
	        System.out.println("a is smallest");
	      else 
		System.out.println("c is smallest");
	    }
	    else 
		System.out.println("b is smallest"); 
	     
		
	  }
	  catch (Exception e)
	  {
	    System.out.println(e);
	  }
	}
}