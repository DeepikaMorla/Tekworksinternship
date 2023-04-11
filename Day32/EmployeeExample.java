import java.util.*;
class Employee
  {
    String name;
    String id;
    double salary;
    Employee(String name,String id,double salary)
    {
      this.name=name;
      this.id=id;
      this.salary=salary;
    }
    public String getName()
    {
      return name;
    }
    public String getId()
    {
      return id;
    }
    public double getSalary()
    {
      return salary;
    }
    public String toString()
    {
      return (name+" "+id+" "+salary);
    }
  }
class EmployeeExample
  {
    public static void main(String args[])
    {
      ArrayList<Employee> emp1=new ArrayList<Employee>();
      emp1.add(new Employee("deepika","14568",45000.0));
      emp1.add(new Employee("chintu","45879",50000.0));
      System.out.println(emp1.toString());
      ArrayList<Employee> emp2=new ArrayList<Employee>();
      emp2.add(new Employee("Ramana","52146",55000.0));
      System.out.println(emp2.toString());
      emp1.remove(1);
      System.out.println(emp1);
      emp2.add(new Employee("siva","58745",45000.0));
      System.out.println(emp2);
    }
  }
