import java.util.*;
class ArrayConversion
  {
    public static void main(String args[])
    {
      ArrayList<String> al=new ArrayList<>();
      al.add("Deepika");
      al.add("Chintu");
      System.out.println("Array List:"+al);
      //Array list to Linked list
      LinkedList<String> ll=new LinkedList<>();
      for(String arr : al){
        ll.add(arr);
      }
      System.out.println("Linked List:"+ll);
    }
  }
