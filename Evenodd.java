import java.util.*;
class Evenodd
  {
    public static void main(String args[])
    {
      int n;
      Scanner sc = new Scanner(System.in);
      n=sc.nextInt();
      int arr[]=new int[n];
      for(int i=0; i<n; i++)
        {
          arr[i]=sc.nextInt();
        }
      int odd=0, even=0;
      for(int i=0; i<n; i++)
        {
          if(arr[i] % 2 == 1)
            odd++;
          else
            even++;
        }
      System.out.println("Odd: "+odd);
      System.out.println("Even: "+even);
    }
  }