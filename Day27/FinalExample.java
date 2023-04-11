import java.util.*;
class FinalExample
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int x=sc.nextInt();
      int y=sc.nextInt();
      try{
        System.out.println(x/y);
      }
      catch(Exception e)
        {
          System.out.println(e);
        }
      System.out.println("program execution completed");
    }
  }
