import java.util.*;
class StringExample
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String string1=new String();
      System.out.println("Give any data to string1 ");
      string1=sc.nextLine();
      //retreving entire string value
      //System.out.println(string);

      //retreving few characters from string
      //stringobject.charAt(indexno)
      //System.out.println(string.charAt(3));
     // System.out.println(string.charAt(13));
      //retreving words from string
      //split() method--> stringobjectname.split(delimiter)
      //default delimiter values is space

      //System.out.println(string.split("1"));
      //String stringarray[]=string.split("1");
      //for(int i=0;i<stringarray.length;i++)
       // System.out.println(stringarray[i]);

      //1.length()
      //System.out.println(string.length());
      //int len=string.length();
      //System.out.println(len);
      //2.concatenation

      //2.1concat()
      //System.out.println(string.concat("hai"));
      //String s2="hello";
      //System.out.println(string.concat(s2));
      //System.out.println(string);
      
      //2.2+operator

      //System.out.println(string+"hai2");
      //System.out.println(string+s2);
     // System.out.println(string+2);
      //3.toString
      //System.out.println(string.toString());
      //StringExample se=new StringExample();
      //System.out.println(se.toString());

      //4.Character Extraction Methods

      //4.1charAt()
      //System.out.println(string.charAt(6));
      //4.2getChars()
      /*char p[]=new char[10];
      string.getChars(3,7,p,2);
      System.out.println(p);
      for(int i=0;i<p.length;i++)
        System.out.println(p[i]);*/
      //4.3getBytes()
     /* byte b[]=string.getBytes();
      for(int i=0;i<b.length;i++)
        System.out.println(b[i]);

      //toCharArray //convert string to array
      char sca[]=string.toCharArray();
      for(int i=0;i<sca.length;i++)
        System.out.println(sca[i]);*/

      //string comparision
      System.out.println("Give data to string2 ");
      String string2=new String(sc.nextLine());
      //1.compareTo() -->int no,+ve/-ve/0
      //System.out.println(string1.compareTo(string2));
      //2.equals() -->true/false
      //System.out.println(string1.equals(string2));
      //3.== -->true/false
      /*System.out.println(string1==string2);
      String s1="hello";
      String s2="hello";
      System.out.println(s1==s2);*/
      //4.1startsWith() -->t/f
     /* System.out.println(string1.startsWith("1"));
      System.out.println(string1.startsWith("ex"));
      System.out.println(string1.startsWith("ea"));
      //4.2endsWith() -->t/f
      System.out.println(string1.endsWith("hello"));
      System.out.println(string1.endsWith("&"));
      //equalsIgnoreCase() -->t/f
      System.out.println(string1.equalsIgnoreCase(string2));*/

      //searching for some pattern

      //1.indexOf --> starting index no
     /* System.out.println(string1.indexOf("ll",4));
      System.out.println(string1.indexOf('o',7));
      //System.out.println(string1.indexOf("llll"));
      //2.lastIndexOf() --> last index no
      System.out.println(string1.lastIndexOf("ll1",4));
      System.out.println(string1.lastIndexOf('o',7));*/
      //System.out.println(string1.toLowerCase());
      //System.out.println(string1.toUpperCase());
      //System.out.println(string1.substring(2));
      //System.out.println(string1.substring(2,3));
      System.out.println(string1.replace("e","78"));
    }
  }