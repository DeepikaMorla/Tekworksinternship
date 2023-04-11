import java.util.*;
class UpperLower
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str;
      System.out.println("Enter string:");
      str=sc.nextLine();
      int u=0,l=0;
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)>='A' && str.charAt(i)<='Z')
            u++;
          if(str.charAt(i)>='a' && str.charAt(i)<='z')
            l++;
        }
      System.out.println("Upper case:"+u);
      System.out.println("Lower case:"+l);
    }
  }