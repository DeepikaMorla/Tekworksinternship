import java.util.*;
class Username
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter string:");
      String str=sc.nextLine();
      System.out.println("1.Username");
      System.out.println("2.Password");
      System.out.println("3.Phone Number");
      System.out.println("Enter your choice:");
      int option=sc.nextInt();
      switch (option)
        {
          case 1:
            displayUsername(str);
            break;
          case 2:
            displayPassword(str);
            break;
          case 3:
            displayPhoneNumber(str);
            break;
          default:
            System.out.println("Invalid input");
        }
    }
    static void displayUsername(String str)
    {
      if(str.length()<6)
      {
        System.out.println("Invalid username");
      }
      else
      {
        int count=0;
        for(int i=0;i<str.length();i++)
          {
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            {
              count++;
              break;
            }
            if(str.charAt(i)>='a' && str.charAt(i)<='z')
            {
              count++;
              break;
            }
            if(str.charAt(i)>='0' && str.charAt(i)<='9')
            {
              count++;
              break;
            }
            if(str.charAt(i)=='@' || str.charAt(i)=='.' || str.charAt(i)=='_')
            {
              count++;
              break;
            }
          }
        if(count>=4)
          System.out.println("Valid username");
        else
          System.out.println("Invalid username");
      }
    }
    static void displayPassword(String str)
    {
      if(str.length()<8)
    {
      System.out.println("Invalid Password");
    }
      else
    {
      int count=0;
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)>='A' && str.charAt(i)<='Z')
          {
            count++;
            break;
          }
          if(str.charAt(i)>='a' && str.charAt(i)<='z')
          {
            count++;
            break;
          }
          if(str.charAt(i)>='0' && str.charAt(i)<='9')
          {
            count++;
            break;
          }
          if(str.charAt(i)=='@' || str.charAt(i)=='.' || str.charAt(i)=='_' || str.charAt(i)=='$' || str.charAt(i)=='*')
          {
            count++;
            break;
          }
        }
      if(count>=4)
        System.out.println("Valid Password");
      else
        System.out.println("Invalid password");
    }
    }
    static void displayPhoneNumber(String str)
    {
      long n=10;
      int a[]=new int[10];
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
          if(a[i]<0 || a[i]>9)
          {
            System.out.println("Invalid number");
            return;
          }
          System.out.println("");
        }
    }
  }
