import java.util.*;
class Palindrome
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter string:");
      String str=sc.nextLine();
      String s1[]=str.split(" ");
      for(int i=0;i<s1.length;i++)
        {
          boolean f=palindrome(s1[i]);
          if(f==true)
            s1[i].replace(s1[i],"palindrome");
        }
      String result=" ";
      for(int i=0;i<s1.length;i++)
        result=result+" "+s1[i]+" ";
      System.out.println(result);
    }
    static boolean palindrome(String str)
    {
      String str1=" ";
      for(int i=str.length()-1;i>0;i--)
        str1=str1+str.charAt(i);
      if(str1==str)
        return true;
      else
        return false;
    }
  }