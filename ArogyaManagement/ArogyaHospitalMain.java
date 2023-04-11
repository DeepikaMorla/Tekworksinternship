import java.util.*;
class ArogyaHospitalMain{
  public static void main(String args[]){
    char ch;
    int choice;
    Scanner sc=new Scanner(System.in);
    ArogyaHospitalImplementation hobj=new ArogyaHospitalImplementation();
    System.out.println("1.Add patient details");
    System.out.println("2.View patient details");
    System.out.println("3.Search patient details by name");
    System.out.println("4.Search patient details by city");
    System.out.println("5.Search patient details by id");
    System.out.println("6.Status of patient recovering");
    System.out.println("7.Search patient details by age");
    System.out.println("8.Contact Us");
    do{
      System.out.println("Enter your choice:");
      choice=sc.nextInt();
      switch(choice){
        case 1: 
          hobj.add_Patient_Details();
          break;
        case 2: 
          hobj.view_Patient_Details();
          break;
        case 3: 
          hobj.searchName();
          break;
        case 4:
          hobj.searchCity();
          break;
        case 5:
          hobj.searchId();
          break;
        case 6:
          hobj.recoveryOfPatients();
          break;
        case 7:
          hobj.search_Age();
          break;
        case 8:
          hobj.Contact_us();
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