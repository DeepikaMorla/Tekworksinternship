import java.util.*;
class Reverse
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter string:");
      String str=sc.nextLine();
      char ch[]=str.toCharArray();
      for(int i=ch.length-1;i>=0;i--)
        System.out.print(ch[i]);
    }
  }