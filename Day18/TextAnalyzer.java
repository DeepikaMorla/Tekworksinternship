import java.util.*;
class TextAnalyzer
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int ch=0,w=1,l=0;
      System.out.println("Enter string:");
      String str=sc.nextLine();
      int a=Character(str,ch);
      System.out.println("Total number of characters "+a);
      int b=Word(str,w);
      System.out.println("Total number of words "+w);
      int c=Line(str,l);
      System.out.println("Total number of lines "+l);
    }
    static int Character(String str,int ch)
    {
      for(int i=0;i<str.length();i++)
        {
          ch++;
        }
      return ch;
    }
    static int Word(String str, int w)
    {
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)==' ')
            w++;
        }
      return w;
    }
    static int  Line(String str, int l)
    {
      for(int i=0;i<=str.length();i++)
        {
          if(str.charAt(i)=='\n')
          {
            l++;
          }
        }
        return l;
    }
  }