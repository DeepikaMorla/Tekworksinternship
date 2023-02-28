import java.util.*;
class Two
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int r,c,i,j;
      System.out.println("Enter number of rows");
      r=sc.nextInt();
      System.out.println("Enter number of columns");
      c=sc.nextInt();
      int arr[][]=new int[r][c];
      for(i=0;i<r;i++)
        {
          for(j=0;j<c;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
    }
  }