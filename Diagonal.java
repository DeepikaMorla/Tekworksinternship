import java.util.*;
class Diagonal
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int rows,cols;
      System.out.println("Enter rows and columns of matrix");
      rows=sc.nextInt();
      cols=sc.nextInt();
      int arr[][]=new int[rows][cols];
      System.out.println("Enter matrix elements");
      for(int i=0;i<rows;i++)
        {
          for(int j=0;j<cols;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
      displayDiagonalMatrix(arr,rows,cols);
    }
    static void displayDiagonalMatrix(int a[][],int r,int c)
    {
      for(int i=0;i<r;i++)
        {
          for(int s=i, t=0;s>=0 && t<c;s--,t++)
            {
              System.out.print(a[s][t]+" ");
            }
          System.out.println();
        }
      for(int i=1;i<c;i++)
        {
          for(int s=r-1,t=i;s>=0 && t<c;s--,t++)
            {
              System.out.print(a[s][t]+" ");
            }
          System.out.println();
        }
    }
  }