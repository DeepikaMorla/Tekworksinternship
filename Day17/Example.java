import java.util.*;
class Example
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      int a=0,b=0;
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)=='1')
            a++;
          else
            b++;
        }
      if(a>b)
        System.out.println("Win");
      else
        System.out.println("Lose");
    }
  }