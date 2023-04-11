import java.util.*;
class Palindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str1,str2="";
      System.out.println("Enter string:");
      str1=sc.nextLine();
      int n=str1.length();
      for(int i=n-1;i>=0;i--)
        {
          str2=str2+str1.charAt(i);
        }
      if(str1.equalsIgnoreCase(str2))
      {
        System.out.println(str1+" is a palindrome");
      }
      else
      {
        System.out.println(str1+" is not a palindrome");
      }
    }
  }