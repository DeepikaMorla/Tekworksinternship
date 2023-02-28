import java.util.*;
class Test
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enetr the value of n:");
      int n=sc.nextInt();
      int sum=0,fact;
      for(int i=1;i<=n;i++)
        {
          fact=1;
          for(int j=1;j<=i;j++)
            {
              fact=fact*j;
            }
          sum=sum+fact;
        }
      System.out.println("The result is: "+sum);
    }
  }