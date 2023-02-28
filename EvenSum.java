import java.util.*;
class EvenSum
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int i = 2, sum = 0;
      System.out.println("Enter n value: ");
      int n = sc.nextInt();
      while(i <= n)
        {
          sum = sum + i;
          i = i + 2;
        }
      System.out.println("Sum of even numbers is: "+sum);
    }
  }