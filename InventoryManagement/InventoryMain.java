import java.util.*;
class InventoryMain
  {
    public static void main(String args[])
    {
      char ch;
      int choice;
      Scanner sc=new Scanner(System.in);
      InventoryImp iobj=new InventoryImp();
      System.out.println("1. Add product");
      System.out.println("2. Remove product");
      System.out.println("3. Display products");
      System.out.println("4. Check product availability");
      do{
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        switch(choice)
          {
            case 1:
              iobj.add();
              break;
            case 2:
              iobj.remove();
              break;
            case 3:
              iobj.display();
              break;
            case 4:
              iobj.check();
              break;
            default:
              System.out.println("Invalid option...");
              break;
          }
        System.out.println("Do you want to perform another operation:");
        ch=sc.next().charAt(0);
      }
        while(ch!='n');
    }
  }