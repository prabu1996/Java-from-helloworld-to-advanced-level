import java.io.DataInputStream;
class TestLeapYearNew
{
  public static void main(String arg[])
  {
    try
    {
      DataInputStream t=new DataInputStream(System.in);
      int year;
      System.out.println("enter year");
      year=Integer.parseInt(t.readLine());
      if (year%4==0)
      {
        if (year%100==0)
        {
          if(year%400==0)
	System.out.println("leap year"); 
        }   
        else 
	System.out.println("not a leap year");
        }
       else 
          System.out.println("leap year"); 
        }
      else
	System.out.println("not a leap year");
     }
     catch (Exception e)
     {
       System.out.println(e);
      }
  }
}