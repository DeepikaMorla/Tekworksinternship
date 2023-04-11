import java.util.*;
class MapList
  {
    public static void main(String args[])
    {
      Map<Integer,String> m=new HashMap<>();
      m.put(101,"deepika");
      m.put(102,"chintu");
      m.put(103,"siva");
      List<Integer> key=new ArrayList(m.keySet());
      List<String> value=new ArrayList(m.values());
      System.out.println("Key List are:"+key);
      System.out.println("Value List are:"+value);
    }
  }