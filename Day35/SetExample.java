import java.util.*;
class SetExample
  {
    public static void main(String args[])
    {
      TreeSet h=new TreeSet();
      h.add(12);
      h.add(3);
      h.add(10);
      h.add(9);
      Iterator i=h.iterator();
      while(i.hasNext()){
        System.out.println(i.next());
      }
    }
  }
