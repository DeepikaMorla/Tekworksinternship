import java.util.*;
class Delete
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n, i, position;
      System.out.println("Enter the number of elements:");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the elements:");
      for(i=0; i<n; i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Enter the position which is to be deleted:");
      position=sc.nextInt();
      for(i=position; i<n-1; i++)
        {
          a[i]=a[i+1];
        }
      n=n-1;
      System.out.println("On deleting the number new array is:");
      for(i=0;i<n;i++)
        {
          System.out.println("a["+i+"]="+a[i]);
        }
    }
  }