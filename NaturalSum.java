import java.util.*;
class NaturalSum
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int i = 1, sum = 0;
      System.out.println("Enter value of n: ");
      int n = sc.nextInt();
      while(i <= n)
        {
          sum = sum + i;
          i++;
        }
      System.out.println("Sum of natural numbers is: "+sum);
    }
  }