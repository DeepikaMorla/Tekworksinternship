import java.util.*;
class OddSum
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int i = 1, sum = 0;
      System.out.println("Enter n value: ");
      int n = sc.nextInt();
      while(i <= n)
        {
          sum = sum + i;
          i = i + 2;
        }
      System.out.print("Sum of odd numbers is: "+sum);
    }
  }