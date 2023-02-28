import java.util.*;
class Sort
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,temp,i,j;
      System.out.println("Enter number of elements in array:");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter array elements:");
      for(i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      for(i=0;i<n;i++)
        {
          for(j=i+1;j<n;j++)
            {
              if(arr[i]>arr[j])
              {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
        }
      System.out.println("Ascending order:");
      for(i=0;i<n-1;i++)
        {
          System.out.print(arr[i]+",");
        }
      System.out.print(arr[n-1]);
    }
  }