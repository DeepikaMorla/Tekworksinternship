import java.util.*;
class Uppercase
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str=new String();
      System.out.println("Enter value for string:");
      str=sc.nextLine();
      System.out.println(str.toUpperCase());
    }
  }