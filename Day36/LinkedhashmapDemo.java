import java.util.*;
class LinkedhashmapDemo {
public static void main(String args[]) {
 
LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
//Adding elements to LinkedHashMap
lhmap.put(22, "Abey");
lhmap.put(33, "Dawn");
lhmap.put(1, "Sherry");
lhmap.put(2, "Karon");
lhmap.put(100, "Jim");
// Generating a Set of entries
Set set = lhmap.entrySet();
// Displaying elements of LinkedHashMap
Iterator iterator = set.iterator();
while(iterator.hasNext()) {
Map.Entry me = (Map.Entry)iterator.next();
System.out.print("Key is: "+ me.getKey() + "& Value is: "+me.getValue()+"\n");
}
}
}
