import java.util.*;
class MiddleLast
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter string:");
      String str=sc.nextLine();
      displayMiddleCharacter(str);
      displayLastCharacter(str);
    }
    static void displayMiddleCharacter(String str)
    {
      int len=str.length();
      int middle=len/2;
      System.out.println("Middle character of string is:"+str.charAt(middle));
    }
    static void displayLastCharacter(String str)
    {
      int len=str.length();
      int last=len-1;
      System.out.println("Last character of string is:"+str.charAt(last));
    }
  }
