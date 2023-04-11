import java.util.*;
class CurrentOverload
  {
    public double billtopay;
    public void currentbill(String name, int cno)
    {
      System.out.println("Customer name:"+name);
      System.out.println("customer number:"+cno);
    }
    public void currentbill(int units)
    {
      if(units<100)
      {
        billtopay=units*1.20;
      }
      else if(units<300)
      {
        billtopay=100*1.20+(units-100)*2;
      }
      else if(units>300)
      {
        billtopay=100*1.20+200*2+(units-300)*3;  
      }
      System.out.println("The current bill is "+billtopay);
    }
  }
class CurrentMain
  {
    public static void main(String args[])
    {
      CurrentOverload co=new CurrentOverload();
      Scanner sc=new Scanner(System.in);
      int units,cno;
      String name;
      System.out.println("Enter customer name:");
      name=sc.nextLine();
      System.out.println("Enter customer number:");
      cno=sc.nextInt();
      System.out.println("Enter number of units:");
      units=sc.nextInt();
      co.currentbill(name,cno);
      co.currentbill(units);
    }
  }
