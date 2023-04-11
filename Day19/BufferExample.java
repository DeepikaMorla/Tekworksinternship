import java.util.*;
class BufferExample
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter string:");
      String str=sc.nextLine();
      StringBuffer sb=new StringBuffer(str);
      sb.append("abc");
      System.out.println(sb);
      sb.insert(2,"abc");
      System.out.println(sb);
      sb.replace(2,4,"abc");
      System.out.println(sb);
      sb.delete(2,3);
      System.out.println(sb);
      sb.reverse();
      System.out.println(sb);
      
    }
  }
