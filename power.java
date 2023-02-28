import java.util.*;
class power
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n, i, exponent;
      long power = 1;
      System.out.println("Enter a number: ");
      n = sc.nextInt();
      System.out.println("Enter exponent: ");
      exponent = sc.nextInt();
      for(i = 1; i <= exponent; i++)
        {
          power = power * n;
        }
      System.out.println("Result is "+power);
    }
  }