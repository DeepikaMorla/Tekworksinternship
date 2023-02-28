import java.util.*;
class Primen
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int i, j, count;
      System.out.println("Enter n value: ");
      int n = sc.nextInt();
      for(j=2; j<=n; j++)
        {
          count=0;
          for(i=1; i<=j; i++)
            {
              if(j%i==0)
              {
                count++;
              }
            }
          if(count==2)
          {
            System.out.print(j+" ");
          }
        }
    }
  }