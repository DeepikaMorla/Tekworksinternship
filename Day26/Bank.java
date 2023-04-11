import java.util.*;
class Customer
  {
    String name,address,accno;
    int age;
    public Customer(String name, String address, String accno, int age)
    {
      this.name=name;
      this.address=address;
      this.accno=accno;
      this.age=age;
    }
  }
class Account
  {
    String acctype,branch;
    public Account(String acctype, String branch)
    {
      this.acctype=acctype;
      this.branch=branch;
    }
  }
class RBI
  {
    int minbal,maxwithdraw;
    double min_r;
    public RBI()
    {
      minbal=1000;
      maxwithdraw=1000000;
      min_r=4.0;
    }
    public void setminRate(double min_r)
    {
      if(min_r>=this.min_r)
      {
        this.min_r=min_r;
      }
      else
      {
        System.out.println("minimum rate as per RBI guidelines is "+this.min_r);
      }
    }
    public void setminBal(int minbal)
    {
      if(minbal>=this.minbal)
      {
        this.minbal=minbal;
      }
      else
      {
        System.out.println("minimum balance according to RBI guidelines is "+this.minbal);
      }
    }
    public void setmaxWithdraw(int maxwithdraw)
    {
      if(maxwithdraw>this.maxwithdraw)
      {
        this.maxwithdraw=maxwithdraw;
      }
      else
      {
        System.out.println("maximum withdraw limit according to RBI guidelines is "+this.maxwithdraw);
      }
    }
    public void printInfo()
    {
      System.out.println("updated minimum balance:"+minbal);
      System.out.println("updated intrest rate:"+min_r);
      System.out.println("updated maximum withdraw:"+maxwithdraw);
    }
  }
class SBI extends RBI
  {
    public SBI(int minbal, int maxwithdraw, double min_r)
    {
      setminBal(minbal);
      setminRate(min_r);
      setmaxWithdraw(maxwithdraw);
    }
    public void printInfo()
    {
      System.out.println("minimum balance:"+minbal);
      System.out.println("intrest rate:"+min_r);
      System.out.println("maximum withdraw:"+maxwithdraw);
    }
  }
class ICICI extends RBI
  {
    public ICICI(int minbal, int maxwithdraw, double min_r)
    {
      setminBal(minbal);
      setminRate(min_r);
      setmaxWithdraw(maxwithdraw);
    }
    public void printInfo()
    {
      System.out.println("minimum balance:"+minbal);
      System.out.println("intrest rate:"+min_r);
      System.out.println("maximu withdraw:"+maxwithdraw);
    }
  }
class PNB extends RBI
  {
    public PNB(int minbal, int maxwithdraw, double min_r)
    {
      setminBal(minbal);
      setminRate(min_r);
      setmaxWithdraw(maxwithdraw);
    }
    public void printInfo()
    {
      System.out.println("minimum balance:"+minbal);
      System.out.println("intrest rate:"+min_r);
      System.out.println("maximu withdraw:"+maxwithdraw);
    }
  }
class Bank
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter minimum balance:");
      int mb=sc.nextInt();
      System.out.println("Enter intrest rate:");
      double mr=sc.nextDouble();
      System.out.println("Enter maximum withdraw limit:");
      int mw=sc.nextInt();
      int a;
      System.out.println("Enter your choice:");
      System.out.println("1.SBI   2.ICICI   3.PNB");
      a=sc.nextInt();
      RBI bank=new RBI();
      switch(a)
        {
          case 1:
            bank=new SBI(mb,mw,mr);
            bank.printInfo();
            break;
          case 2:
            bank=new ICICI(mb,mw,mr);
            bank.printInfo();
            break;
          case 3:
            bank=new PNB(mb,mw,mr);
            bank.printInfo();
            break;
          default:
            System.out.println("Invalid input...");
        }
    }
  }
