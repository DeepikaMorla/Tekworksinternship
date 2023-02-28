import java.util.*;
class MatrixAddition
{
    public static void main(String[] args) 
    {
        int firstrows, firstcolumns, secondrows, secondcolumns;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix:");
        firstrows = sc.nextInt();
        System.out.print("Enter number of columns in first matrix:");
        firstcolumns = sc.nextInt();
        System.out.print("Enter number of rows in second matrix:");
        secondrows = sc.nextInt();
        System.out.print("Enter number of columns in second matrix:");
        secondcolumns = sc.nextInt();
        if (firstrows == secondrows && firstcolumns == secondcolumns)
        {
            int a[][] = new int[firstrows][firstcolumns];
            int b[][] = new int[secondrows][secondcolumns];
            int c[][] = new int[secondrows][secondcolumns];
            System.out.println("Enter all the elements of first matrix:");
            for (int i = 0; i < firstrows; i++) 
            {
                for (int j = 0; j < firstcolumns; j++) 
                {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("Enter all the elements of second matrix:");
            for (int i = 0; i < secondrows; i++) 
            {
                for (int j = 0; j < secondcolumns; j++) 
                {
                    b[i][j] = sc.nextInt();
                }
            }
            System.out.println("First Matrix:");
            for (int i = 0; i < firstrows; i++) 
            {
                for (int j = 0; j < firstcolumns; j++) 
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println("");
            }
            System.out.println("Second Matrix:");
            for (int i = 0; i < secondrows; i++) 
            {
                for (int j = 0; j < secondcolumns; j++) 
                {
                    System.out.print(b[i][j]+" ");
                }
                System.out.println("");
            }
            for (int i = 0; i < firstrows; i++) 
            {
                for (int j = 0; j < secondcolumns; j++) 
                {
                        c[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("Matrix after addition:");
            for (int i = 0; i < firstrows; i++) 
            {
                for (int j = 0; j < secondcolumns; j++) 
                {
                    System.out.print(c[i][j]+" ");
                }
                System.out.println("");
            }
        }
        else
        {
            System.out.println("Addition would not be possible");
        }
    }
}