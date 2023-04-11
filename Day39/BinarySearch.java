import java.util.*;
class BinarySearch
  {
    int binarySearch(int first,int last,int key,int arr[])
    {
      while(first<=last)
        {
          int middle=(first-last)/2;
          if(arr[middle]==key)
          {
            return middle;
          }
          else if(arr[middle]>key)
          {
            return binarySearch(arr,middle+1,last,key);
          }
          else
          {
            return binarSearch(arr,first,middle-1,key);
          }
          middle=(first+last)/2;
        }
      if(first>last)
      {
        return -1;
      }
    }
    public static void main(String args[])
    {
      BinarySearch b=new BinarySearch();
      int arr[],size,first,last,key;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of array:");
      size=sc.nextInt();
      arr=new int[size];
      System.out.println("Enter array elements:");
      for(int i=0;i<size;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("Enter search element:");
      key=sc.nextInt();
      int result=b.binarySearch(arr,first,last,key);
      if(result==-1){
        System.out.println("Element not found");
      }
      else{
        System.out.println("Element found");
      }
    }
  }
