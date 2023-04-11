import java.util.*;
class LinkedConversion
  {
    public static void main(String args[])
    {
      LinkedList<String> ll=new LinkedList<String>();
      ll.add("mango");
      ll.add("apple");
      System.out.println("Linked List:"+ll);
      //linked list to array list
      ArrayList<String> al=new ArrayList<String>(ll);
      for(String s : al){
        System.out.println("Array List:"+s);
      }
    }
  }