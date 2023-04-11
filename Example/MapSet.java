import java.util.*;
class MapSet
  {
    public static void main(String args[])
    {
      Map<Integer,String> m=new HashMap<>();
      m.put(101,"deepika");
      m.put(102,"chintu");
      m.put(103,"siva");
      Set<Integer> key=new HashSet(m.keySet());
      Set<String> value=new HashSet(m.values());
      System.out.println("Key Set:"+key);
      System.out.println("Value Set:"+value);
    }
  }