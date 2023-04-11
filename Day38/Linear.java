import java.util.*;
class Linear
  {
    public static void main(String args[])
    {
      int i,n,value,arr[];
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter array length:");
      n=sc.nextInt();
      arr=new int[n];
      System.out.println("Enter elements of array:");
      for(i=0;i<n;i++){
        arr[i]=sc.nextInt();
      }
      System.out.println("Enter search element:");
      value=sc.nextInt();
      for(i=0;i<n;i++){
        if(arr[i]==value)
          System.out.println(i);
          break;
      }
      if(i==n)
        System.out.println("element not found");
    }
  }
