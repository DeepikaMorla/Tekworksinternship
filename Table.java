import java.util.*;
class Table
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int i = 1, m;
      System.out.println("Enter the number: ");
      int n = sc.nextInt();
      m = n * i;
      while(i <= 10)
        {
          System.out.println(n +"*" +i+ "=" +m) ;
          i++;
        }
    }
  }