import java.util.*;
class Index
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int i,n,item;
      int index=-1;
      System.out.println("Enter the number of elements in array:");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter array elements:");
      for(i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      System.out.println("Enter the element whose index you want to find:");
      item=sc.nextInt();
      for(i=0;i<n;i++)
        {
          if(arr[i]==item)
          {
            index=i;
            break;
          }
        }
      System.out.println(item+" is located at "+index+" index");
    }
  }