import java.util.*;
class MedicineMain{
  public static void main(String args[]){
    char c;
    int choice;
    Scanner sc=new Scanner(System.in);
    MedicineImp medobj=new MedicineImp();
    System.out.println("1.Add medicine details");
    System.out.println("2.Delete medicine details");
    System.out.println("3.Search medicine details");
    System.out.println("4.Display medicine details");
    do{
      System.out.println("Enter your choice:");
      choice=sc.nextInt();
      switch(choice){
        case 1:
          medobj.insert();
          break;
        case 2:
          medobj.delete();
          break;
        case 3:
          medobj.search();
          break;
        case 4:
          medobj.display();
          break;
        default:
          System.out.println("Invalid option");
          break;
      }
      System.out.println("Do you want to continue operation:");
      c=sc.next().charAt(0);
    }
      while(c!='n');
  }
}