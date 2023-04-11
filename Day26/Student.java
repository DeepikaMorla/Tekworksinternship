import java.util.*;
class Student
  {
    public String name;
    public int age;
    public String address;
    public Student()
    {
      name="unknown";
      age=0;
      address="not available";
    }
    public void setInfo(String name,int age)
    {
      this.name=name;
      this.age=age;
      System.out.println("Name is:"+name);
      System.out.println("Age is:"+age);
    }
    public void setInfo(String name, int age, String address)
    {
      this.name=name;
      this.age=age;
      this.address=address;
      System.out.println("Name is:"+name);
      System.out.println("Age is:"+age);
      System.out.println("Address is:"+address);
    }
  }
class StudentMain
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      String n1,n2;
      
    }
  }
