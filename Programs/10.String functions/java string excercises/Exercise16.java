//import java.util.Calendar;

public class Exercise16 {
 
  public static void main(String[] args)
    {
        String a = "This is a sample String.";
        byte[] b = a.getBytes();
        String c = new String(b);
        System.out.println("\nThe new String equals " +
            c + "\n");
    }
}
