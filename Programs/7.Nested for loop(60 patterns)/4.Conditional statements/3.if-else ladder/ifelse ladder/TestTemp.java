import java.io.*;
class TestTemp 
{
  public static void main(String arg[])
  {
    try{
    	DataInputStream t=new DataInputStream(System.in);
	int temp;
	System.out.println("enter temp value");
	temp=Integer.parseInt(t.readLine());
	if (temp<0)
	 System.out.println("freezing"); 
	else if ((temp>=0)&&(temp<11))
	  System.out.println("very cold");
	else if ((temp>=11)&&(temp<21))
	  System.out.println("cold");
	else if ((temp>=21)&&(temp<31))
	  System.out.println("normal");
	else if ((temp>=31)&&(temp<41))
	  System.out.println("hot");
	else if (temp>40)
	  System.out.println("very hot");	
    }
    catch (Exception e)
    {
       System.out.println(e);
    }
  }
}
