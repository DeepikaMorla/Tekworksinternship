import java.util.*;
class Student
  {
    int id;
    String name;
    public Student(int id, String name)
    {
      this.id=id;
      this.name=name;
    }
    public int getId(){
      return id;
    }
    public String getName(){
      return name;
    }
    public String toString(){
      return id+" "+name;
    }
  }
class SetMap
  {
    public static void main(String args[])
    {
      Set<Student> stu=new HashSet<>();
      stu.add(new Student(101,"deepika"));
      stu.add(new Student(102,"chintu"));
      Map<Integer,String> m=new HashMap<>();
      for(Student s:stu){
        m.put(s.getId(),s.getName());
      }
      System.out.println("Map is"+m);
    }
  }