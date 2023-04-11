import java.util.*;
class Capitalize
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter string:");
      String str1=sc.nextLine();
      String str2=str1.toUpperCase();
      System.out.println("Result:"+str2);
    }
  }
