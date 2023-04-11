import java.util.*;
class MobileNumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      long n=10;
      int a[]=new int[10];
      System.out.println("Enter the digits of phone number:");
      String str=sc.nextLine();
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          if(a[i]<0 || a[i]>9)
          {
            System.out.println("Invalid number");
            return;
          }
          System.out.println("valid mobile number is");
        }
    }
  }