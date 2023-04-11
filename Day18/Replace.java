import java.util.*;
class Replace
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter string1:");
      String str1=sc.nextLine();
      System.out.println("Enter string2:");
      String str2=sc.nextLine();
      displayResult(str1,str2);
    }
    public static void displayResult(String str1, String str2)
    {
      String result=str1.replace(str1,str2);
      System.out.println(result);
    }
  }