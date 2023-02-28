import java.util.*;
class UpperTriangle
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int rows,columns,i,j;
      System.out.println("Enter rows and columns of matrix");
      rows=sc.nextInt();
      columns=sc.nextInt();
      int arr[][]=new int[rows][columns];
      System.out.println("Enter matrix elements");
      for(i=0;i<rows;i++)
        {
          for(j=0;j<columns;j++)
            {
              arr[i][j]=sc.nextInt();
            }
        }
      displayUpperTriangleMatrix(arr,rows,columns);
    }
    static void displayUpperTriangleMatrix(int a[][],int r,int c)
    {
      System.out.println("Upper Triangular matrix is:");
      for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
            {
              if(i>j)
              {
                System.out.print("0 ");
              }
              else
              {
                System.out.print(a[i][j]+" ");
              }
            }
          System.out.println();
        }
      
    }
  }