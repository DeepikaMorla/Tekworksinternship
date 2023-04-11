import java.util.*;
class InsertionSort
  {
    void insertionSort(int arr[],int n)
    {
      n=arr.length;
      for(int i=0;i<n;i++)
        {
          int k=arr[i];
          int j=i-1;
          while(j>=0 && arr[j]>k)
            {
              arr[j+1]=arr[j];
              j=j-1;
            }
          arr[j+1]=k;
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
      InsertionSort is=new InsertionSort();
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
      is.insertionSort(arr,n);
      is.Array(arr,n);
    }
  }
