import java.util.*;
class MinMax
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number of elements in array:");
      int n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter all elements:");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      displayMinMax(arr,n);
    }
    static void displayMinMax(int arr[], int n)
    {
      int temp;
      for(int i=0;i<n;i++)
        {
          for(int j=i+1;j<n;j++)
            {
              if(arr[i]>arr[j])
              {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
              }
            }
        }
      System.out.println("Second Maximum:"+arr[n-2]);
      System.out.println("Second Minimum:"+arr[0]);
    }
  }