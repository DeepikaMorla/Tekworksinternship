import java.util.*;
class SelectionSort
  {
    void selectionSort(int arr[],int n)
    {
      n=arr.length;
      for(int i=0;i<n-1;i++)
        {
          int m=i;
          for(int j=i+1;j<n;j++)
            {
              if(arr[j]<arr[m])
                m=j;
            }
          int temp=arr[m];
          arr[m]=arr[i];
          arr[i]=temp;
        }
    }
    void Array(int arr[],int n)
    {
      n=arr.length;
      for(int i=0;i<n;++i){
        System.out.print(arr[i]+" ");
      }
    }
    public static void main(String args[])
    {
      SelectionSort ss=new SelectionSort();
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
      ss.selectionSort(arr,n);
      ss.Array(arr,n);
    }
  }
