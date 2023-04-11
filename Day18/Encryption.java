import java.util.*;
class Encryption
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String string=new String();
      System.out.println("Read some text to encript");
      string=sc.nextLine();
      System.out.println("read position number to encript character");
      int position=sc.nextInt();
      String r=Encription(string,position);
      System.out.println("message before encription"+string);
      System.out.println("message after encription"+r);
      String res=Decription(r,position);
      System.out.println("message after decription"+res);
    }
    public static String Encription(String s, int p)
    {
      String result="";
      for(int i=0;i<s.length();i++)
        {
          result=result+(char)(s.charAt(i)+p%26);
        }
      return result;
    }
    public static String Decription(String r, int p)
    {
      String result1="";
      for(int i=0;i<r.length();i++)
        {
          result1=result1+(char)(r.charAt(i)-p%26);
        }
      return result1;
    }
  }
