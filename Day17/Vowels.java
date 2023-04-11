import java.util.*;
class Vowels
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter string:");
      String str=sc.nextLine();
      char ch[]=str.toCharArray();
      //int n=ch.length();
      int v=0,c=0,d=0,s=0,ss=0;
      for(int i=0;i<ch.length;i++)
        {
          if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' || ch[i]=='A' || ch[i]=='E' || ch[i]=='I' || ch[i]=='O' || ch[i]=='U')
          {
            v++;
          }
          else if(ch[i]>='a' && ch[i]<='z' || ch[i]>='A' && ch[i]<='Z')
          {
            c++;
          }
          else if(ch[i]>='0' && ch[i]<='9')
          {
            d++;
          }
          else if(ch[i]==' ')
          {
            s++;
          }
          else
          {
            ss++;
          }
        }
      System.out.println("Vowels:"+v);
      System.out.println("Consonants:"+c);
      System.out.println("Digits:"+d);
      System.out.println("Spaces:"+s);
      System.out.println("Special symbols:"+ss);
    }
  }