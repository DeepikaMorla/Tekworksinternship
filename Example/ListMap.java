// List to Map conversion

import java.util.*;
class Student {
  int id;
  String name;
  public Student(int id, String name){
    this.id=id;
    this.name=name;
  }
  public int getId(){
    return id;
  }
  public String getName(){
    return name;
  }
}
class ListMap{
  public static void main(String args[]){
    List<Student> l=new ArrayList<Student>();
    l.add(new Student(123,"deepika"));
    l.add(new Student(456,"chintu"));
    Map<Integer,String> m=new HashMap<>();
    for(Student s:l){
      m.put(s.getId(),s.getName());
    }
    System.out.println("Map is: "+m);
  }
}