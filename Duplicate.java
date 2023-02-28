import java.util.*;
class Duplicate
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int n,i,j,dup=0;
      System.out.println("Enter number of elements in array:");
      n=sc.nextInt();
      int dup_arr[]=new int[n];
      System.out.println("Enter array elemts:"+n);
      for(i=0;i<n;i++)
        {
          dup_arr[i]=sc.nextInt();
        }
      for(i=0;i<n;i++)
        {
          for(j=1;j<n;j++)
            {
              if(dup_arr[i]==dup_arr[j])
              {
                dup++;
                break;
              }
            }
        }
      System.out.println("Total number of duplicates are:"+dup);
    }
  }