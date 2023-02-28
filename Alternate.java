import java.util.*;
class Alternate
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n,i;
      System.out.println("Enter the number of elements in array:");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter array elements:"+n);
      for(i=0; i<n; i++)
        {
          arr[i]=sc.nextInt();
        }
      for(i=0;i<n;i=i+2)
        {
          System.out.print(arr[i]+" ");
        }
    }
  }