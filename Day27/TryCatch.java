import java.util.*;
class TryCatch
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number:");
      int n=sc.nextInt();
      try
        {
          System.out.println(Math.sqrt(n));
        }
      catch(Exception e)
        {
          System.out.println(e);
        }
    }
  }
