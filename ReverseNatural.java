import java.util.*;
class ReverseNatural
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter maximum value: ");
      int i = sc.nextInt();
      while(i > 0)
        {
          System.out.print(i);
          i--;
        }
    }
  }