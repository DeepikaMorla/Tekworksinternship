import java.util.*;
class Count
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int count = 0;
      System.out.println("Enter the number: ");
      int n = sc.nextInt();
      while(n != 0)
        {
          n = n/10;
          count++;
        }
      System.out.println("Number of digits in the given number is: "+count);
    }
  }