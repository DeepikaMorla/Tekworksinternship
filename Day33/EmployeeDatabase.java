import java.util.*;
class Employee{
  private int id;
  private String name;
  private int age;
  private double salary;
  public Employee(int id, String name, int age, double salary) {
	      this.id=id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
  public int getId() {
	 return id;
  }
  public String getName() {
	 return name;
  }
  public int getAge() {
	 return age;
  }
  public double getSalary() {
	 return salary;
  }
  public String toString(){
    return "id=" + id +", name=" + name + ", age=" + age + ", salary=" + salary;
  }
}
class EmployeeDatabase{
  public static void main(String args[]){
    
    Scanner sc=new Scanner(System.in);
    ArrayList<Employee> employeeList=new ArrayList<Employee>();
    //adding/insert
    employeeList.add(new Employee(101,"John",30,60000));
    //calling employee constructor and this is creating employee object
    employeeList.add(new Employee(102,"Jane",23,12000));
    employeeList.add(new Employee(109,"Bob",40,40000));
    ///travelling operation
    Iterator it=employeeList.iterator();
    while(it.hasNext()){
      System.out.println(it.next());
    }
    String verify=null;
    //for(Employee e : employeeList) 
      //e.toString();
    System.out.println("enter id to get employee details");
    int sid=sc.nextInt();
    for(Employee e : employeeList){
      if(e.getId()==sid){
       // System.out.println("id: "+e.getId()+" Name: "+e.getName()+" Age: "+e.getAge()+" Salary: "+e.getSalary());
        e.toString();
        verify="found";
        break;
      }
    }
    if(verify==null){
      System.out.println("not found");
    }
    String verify2=null;
    System.out.println("enter id to delete employee details");
    int did=sc.nextInt();
    for(Employee e : employeeList){
      if(e.getId()==did){
       employeeList.remove(e);
        verify2="found";
        break;
      }
    }
    if(verify2==null){
      System.out.println("not found");
    }
    Iterator itr=employeeList.iterator();
    while(itr.hasNext()){
      System.out.println(itr.next());
    }
  }
}
