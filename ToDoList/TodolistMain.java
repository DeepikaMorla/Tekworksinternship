import java.util.*;
class TodolistMain
  {
    public static void main(String args[])
    {
      char ch;
      int choice;
      Scanner sc=new Scanner(System.in);
      TodolistImp tobj=new TodolistImp();
      System.out.println("1. Add tasks");
      System.out.println("2. Remove tasks");
      System.out.println("3. Update tasks");
      System.out.println("4. Display tasks");
      do{
        System.out.println("Enter your choice:");
        choice=sc.nextInt();
        switch(choice)
          {
            case 1:
              tobj.add();
              break;
            case 2:
              tobj.remove();
              break;
            case 3:
              tobj.update();
              break;
            case 4:
              tobj.display();
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