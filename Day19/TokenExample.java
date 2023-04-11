import java.util.*;
class TokenExample
  {
    public static void main(String args[])
    {
      String s="12 erre 475843 84";
      StringTokenizer st=new StringTokenizer(s);
      System.out.println(st.countTokens());
      while(st.hasMoreTokens())
        {
          System.out.println(st.nextToken());
        }
    }
  }