import java.util.*;
class ShoppingMain
  {
    public static void main(String args[])
    {
      char ch;
      int choice;
      Scanner sc=new Scanner(System.in);
      ShoppingImp sobj=new ShoppingImp();
      System.out.println("1. Add items");
      System.out.println("2. Remove items");
      System.out.println("3. Display items");
      System.out.println("4. Total cost of items");
      do{
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        switch(choice)
          {
            case 1:
              sobj.add();
              break;
            case 2:
              sobj.remove();
              break;
            case 3:
              sobj.display();
              break;
            case 4:
              sobj.total_cost();
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