import java.util.*;
class SetConversion
  {
    public static void main(String args[])
    {
      Set<String> s=new HashSet<String>();
      s.add("red");
      s.add("white");
      ArrayList<String> al=new ArrayList<String>();
      al.addAll(s);
      for(String str : al){
        System.out.println("Array List:"+str);
      }
    }
  }