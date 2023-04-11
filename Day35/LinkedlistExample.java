import java.util.*;
class LinkedlistExample
  {
    public static void main(String args[])
    {
      LinkedList l=new LinkedList();
      l.add("deepika");
      l.add("chintu");
      System.out.println("Added elements:"+l);
      l.addFirst("ramana");
      System.out.println("Added first element:"+l);
      l.addLast("siva");
      System.out.println("Added last element:"+l);
      System.out.println("First element is "+l.getFirst());
      System.out.println("Last element is "+l.getLast());
      System.out.println("Removed first element:"+l.removeFirst());
      System.out.println("Removed last element:"+l.removeLast());
      Enumeration e=l.element();
      while(e.hasMoreElements()){
        System.out.println(e.nextElement());
      }
      Iterator i=l.iterator();
      while(i.hasNext()){
        System.out.println(i.next());
      }
      ListIterator li=l.listIterator();
      while(li.hasNext())
      {
 
        System.out.println(li.next());
      }
    }
  }
