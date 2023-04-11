import java.util.*;
class Tall
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int t=sc.nextInt();
      while(t!=0)
        {
          System.out.println("Enter height of x:");
          int a=sc.nextInt();
          System.out.println("Enter height of y:");
          int b=sc.nextInt();
          if(a>b)
          {
            System.out.println("A");
          }
          else
          {
            System.out.println("B");
          }
        }
    }
  }