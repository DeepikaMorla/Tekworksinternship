import java.util.*;
class Prime
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int count = 0, i;
      System.out.println("Enter a number: ");
      int n = sc.nextInt();
      for(i = 2; i < n; i++)
        {
          if(n % i == 0)
          {
            count++;
            break;
          }
        }
      if(count==0)
      {
        System.out.println("It is prime");
      }
      else
      {
        System.out.println("It is not prime");
      }
    }
  }