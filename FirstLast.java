import java.util.*;
class FirstLast
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int n = sc.nextInt();
      int firstdigit = 0;
      int lastdigit = 0;
      lastdigit = n % 10;
      System.out.println("Last Digit is: "+lastdigit);
      while(n != 0)
        {
          firstdigit = n % 10;
          n = n / 10;
        }
      System.out.println("First Digit is: "+firstdigit);
    }
  }