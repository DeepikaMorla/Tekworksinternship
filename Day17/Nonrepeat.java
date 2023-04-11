import java.util.*;
class Nonrepeat
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter string:");
      String str1=sc.nextLine();
      for(int i=0;i<str1.length();i++)
        {
          boolean unq=true;
          for(int j=0;j<str1.length();j++)
            {
              if(i != j && str1.charAt(i)==str1.charAt(j))
              {
                unq=false;
                break;
              }
            }
          if(unq)
          {
            System.out.println("The first non repeated character is "+str1.charAt(i));
            break;
          }
        }
    }
  }