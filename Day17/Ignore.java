import java.util.*;
class Ignore
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str1=new String();
      System.out.println("Enter value for string1:");
      str1=sc.nextLine();
      String str2=new String();
      System.out.println("Enter value for string2:");
      str2=sc.nextLine();
      System.out.println(str1.equalsIgnoreCase(str2));
    }
  }