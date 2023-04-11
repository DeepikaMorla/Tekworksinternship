import java.util.*;
//import EmployeeDatabase.EmployeeImp;
class EmployeeMain{
  public static void main(String args[]){
    char ch;
    int choice;
    Scanner sc=new Scanner(System.in);
    EmployeeImp empobj=new EmployeeImp();
    System.out.println("1.Add employee details");
    System.out.println("2.Delete employee details");
    System.out.println("3.Search employee details");
    System.out.println("4.Display employee details");
    do{
      System.out.println("Enter your choice:");
      choice=sc.nextInt();
      switch(choice){
        case 1: 
          empobj.insert();
          break;
        case 2: 
          empobj.delete();
          break;
        case 3: 
          empobj.search();
          break;
        case 4: 
          empobj.display();
          break;
        default:
          System.out.println("Invalid option");
          break;
      }
      System.out.println("Do you want to continue one more operation:");
      ch=sc.next().charAt(0);
    }
      while(ch!='n');
  }
}
