import java.util.*;
class BubbleSort
  {
    void bubbleSort(int arr[],int n)
    {
      n=arr.length;
      for(int i=0;i<n-1;i++)
        {
          for(int j=0;j<n-1;j++)
            {
              if(arr[j]>arr[j+1])
              {
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              }
            }
        }
    }
    void Array(int arr[],int n)
    {
      n=arr.length;
      for(int i=0;i<n;++i)
        {
          System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[])
    {
      BubbleSort bs=new BubbleSort();
      Scanner sc=new Scanner(System.in);
      int arr[],n;
      System.out.println("Enter size of array:");
      n=sc.nextInt();
      arr=new int[n];
      System.out.println("Enter array elements:");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      bs.bubbleSort(arr,n);
      System.out.println("Sorted Array:");
      bs.Array(arr,n);
    }
  }
