import java.util.*;
class MatrixMultiplication
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int firstrows,firstcolumns,secondrows,secondcolumns,i,j;
      System.out.println("Enter dimensions of first matrix");
      firstrows=sc.nextInt();
      firstcolumns=sc.nextInt();
      System.out.println("Enter dimensions of second matrix");
      secondrows=sc.nextInt();
      secondcolumns=sc.nextInt();
      int firstmatrix[][]=new int[firstrows][firstcolumns];
      int secondmatrix[][]=new int[secondrows][secondcolumns];
      System.out.println("Give data for First Matrix");
      for(i=0;i<firstrows;i++)
        {
          for(j=0;j<firstcolumns;j++)
            {
              firstmatrix[i][j]=sc.nextInt();
            }
        }
      System.out.println("Give data for Second Matrix");
      for(i=0;i<secondrows;i++)
        {
          for(j=0;j<secondcolumns;j++)
            {
              secondmatrix[i][j]=sc.nextInt();
            }
        }
      multiplication(firstmatrix,firstrows,firstcolumns,secondmatrix,secondrows,secondcolumns);
    }
    static void multiplication(int f[][],int r1,int c1,int s[][],int r2,int c2)
    {
      int resultmatrix[][]=new int[r1][c2];
      if(c1==r2)
      {
        for(int i=0;i<r1;i++)
          {
            for(int j=0;j<c2;j++)
              {
                resultmatrix[i][j]=0;
                for(int k=0;k<c1;k++)
                  {
                    resultmatrix[i][j]=f[i][k]*s[k][j];
                  }
              }
          }
        for(int i=0;i<r1;i++)
          {
            for(int j=0;j<c2;j++)
              {
                System.out.println(resultmatrix[i][j]+"\t");
              }
            System.out.println("\n");
          }
      }
      else
        System.out.println("Multiplication not possible");
    }
  }