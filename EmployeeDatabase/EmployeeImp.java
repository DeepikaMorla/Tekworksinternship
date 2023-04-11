import java.util.*;
//import EmployeeDatabase.EmployeeData;
//import EmployeeDatabase.EmployeeInterface;
class EmployeeImp implements EmployeeInterface{
  ArrayList<EmployeeData> emparr=new ArrayList<>();
  public void insert(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter employee details like id,name,salary");
    int id=s.nextInt();
    String name=s.nextLine();
    double sal=s.nextDouble();
    emparr.add(new EmployeeData(id,name,sal));
  }
  public void delete(){
    Scanner s=new Scanner(System.in);
    if(emparr.size()==0){
      System.out.println("no data is available to delete");
    }
    else{
      String verify=null;
      System.out.println("Enter employee id to delete data");
      int empid=s.nextInt();
      for(EmployeeData e:emparr)
        {
          if(e.getEmpid()==empid)
            emparr.remove(e);
          verify="found";
          break;
        }
      if(verify==null)
        System.out.println("employee data not available with this id");
    }
  }
  public void search(){
    Scanner s=new Scanner(System.in);
    if(emparr.size()==0){
      System.out.println("no data is available to search");
    }
    else{
      String verify=null;
      System.out.println("Enter employee id to search data");
      int empid=s.nextInt();
      for(EmployeeData e:emparr)
        {
          if(e.getEmpid()==empid)
            System.out.println(e.getEmpid()+" "+e.getEmpname()+" "+e.getSalary());
          verify="found";
          break;
        }
      if(verify==null)
        System.out.println("employee data not available with this id");
    }
  }
  public void display(){
    if(emparr.size()==0){
      System.out.println("no data is available");
    }
    else{
      Iterator itr=emparr.iterator();
      while(itr.hasNext()){
        System.out.println(itr.next());
      }
    }
  }
}
