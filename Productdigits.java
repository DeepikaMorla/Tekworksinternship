import java.util.*;
class Productdigits
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n = sc.nextInt();
      int product = 1;
      while(n!=0)
        {
          product = product * (n % 10);
          n = n / 10;
        }
      System.out.println("Product of digits is: "+product);
    }
  }