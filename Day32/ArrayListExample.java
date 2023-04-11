import java.util.*;
class Student
  {
    String name;
    String id;
    int totalmarks;
    Student(String name,String id,int totalmarks)
    {
      this.name=name;
      this.id=id;
      this.totalmarks=totalmarks;
    }
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public int getTotalmarks() {
		return totalmarks;
	} 
    public String toString()
    {
      return(name+" "+id+" "+totalmarks);
    }
  }
class ArrayListExample
  {
    public static void main(String args[])
    {
      ArrayList<Student> ar1=new ArrayList<Student>();
      //homogenous type object
      ar1.add(new Student("aaa","123",67));
      System.out.println(ar1.toString());
      ArrayList<Student> ar2=new ArrayList<Student>();
      ar2.add(new Student("bbb","133",567));
      System.out.println(ar2.toString());
      
      
    }
  }
