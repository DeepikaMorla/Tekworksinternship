import java.util.*;
class Concatenation
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
      String str3=str1.concat(str2);
      System.out.println("The result after concatenation is "+str3);
    }
  }