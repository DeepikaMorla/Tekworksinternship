import java.util.*;
class Natural
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int i = 1;
      System.out.println("Enter value of n: ");
      int n = sc.nextInt();
      while(i <= n)
        {
          System.out.print(i);
          i++;
        }
    }
  }