import java.util.*;
class Num
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int a;
      a = sc.nextInt();
      if(a == 0)
      {
        System.out.println("a value is zero");
      }
      else if(a > 0)
      {
        System.out.println("a value is positive");
      }
      else
      {
        System.out.println("a value is negative");
      }
    }
  }