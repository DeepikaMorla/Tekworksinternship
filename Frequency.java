import java.util.*;
class Frequency
  {
    public static void main(String args[])
    {
      int n,x,count=0,i=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number of elements in array:");
      n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter all elements:");
      for(i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Enter the element of which you want the frequency:");
      x=sc.nextInt();
      for(i=0;i<n;i++)
        {
          if(a[i]==x)
          {
            count++;
          }
        }
      System.out.println("Frequency of the element is:"+count);
    }
  }