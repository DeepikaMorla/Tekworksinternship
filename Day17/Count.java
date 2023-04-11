import java.util.*;
class Count
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str=new String();
      System.out.println("Enter string:");
      str=sc.nextLine();
      int count=1;
      int n=str.length();
      for(int i=0;i<n;i++)
        {
          if(str.charAt(i)==' ')
          {
            count++;
          }
        }
      System.out.println("The string contains "+count+" words");
    }
  }