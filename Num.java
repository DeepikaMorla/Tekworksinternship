import java.util.*;
class Num
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n;
      System.out.println("Enter number of elements in array:");
      n=sc.nextInt();
      int arr[]=new int[n];
      System.out.println("Enter all elements:");
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      displayNegativePositiveZero(arr,n);
      displayEvenOdd(arr,n);
    }
    static void displayNegativePositiveZero(int arr[], int n)
    {
      int countP=0,countZ=0,countN=0;
      for(int i=0;i<n;i++)
        {
          if(arr[i]>0)
          {
            countP++;
          }
          else if(arr[i]<0)
          {
            countN++;
          }
          else
          {
            countZ++;
          }
        }
      System.out.println("Total positive numbers:"+countP);
      System.out.println("Total negative numbers:"+countN);
      System.out.println("Total number of zeros:"+countZ);
    }
    static void displayEvenOdd(int arr[], int n)
    {
      int countE=0,countO=0;
      for(int i=0;i<n;i++)
        {
          if(arr[i]%2==0)
          {
            countE++;
          }
          else
          {
            countO++;
          }
        }
      System.out.println("Total even numbers:"+countE);
      System.out.println("Total odd numbers:"+countO);
    }
  }