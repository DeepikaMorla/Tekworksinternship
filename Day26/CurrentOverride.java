import java.util.*;
class CurrentOverride
  {
    public int billtopay;
    public void bill(int cno)
    {
      System.out.println("customer number:"+cno);
    }
  }
class ChildCurrentOverride extends CurrentOverride
  {
    double billtopay=0;
    public void bill(int units)
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
class CurrentBillMain
  {
    public static void main(String args[])
    {
      CurrentOverride co=new CurrentOverride();
      ChildCurrentOverride c=new ChildCurrentOverride();
      Scanner sc=new Scanner(System.in);
      int units,cno;
      String name;
      System.out.println("Enter customer name:");
      name=sc.nextLine();
      System.out.println("Enter customer number:");
      cno=sc.nextInt();
      System.out.println("Enter number of units:");
      units=sc.nextInt();
      co.bill(cno);
      c.bill(units);
    }
  }
