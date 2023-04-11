import java.util.*;
class Account
  {
    long accountno;
    double balance;
    String name;
    void setdetails()
    {
      System.out.println("Enter account holder details:");
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter account number:");
      accountno=sc.nextLong();
      System.out.println("Enter balance:");
      balance=sc.nextDouble();
      System.out.println("Enter account holder name:");
      name=sc.nextLine();
    }
    void deposit()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter amount to deposit:");
      double deposit=sc.nextDouble();
      balance=balance+deposit;
      System.out.println("Your money is successfully deposited");
      System.out.println("Total balance is "+balance);
    }
    void withdraw()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter amount to withdraw:");
      double withdraw=sc.nextDouble();
      if(balance>withdraw)
      {
        balance=balance-withdraw;
        System.out.println("Please collect your cash");
        System.out.println("Remaining balance is "+balance);
      }
      else
      {
        System.out.println("Insufficient balance...");
      }
    }
    void checkbalance()
    {
      System.out.println("Balance is "+balance);
    }
  }
class ATMSimulator
  {
    String listofaccounts[]={"Joint account" , "Individual account"};
    void addAccount()
    {
      
    }
    void removeAccount()
    {
      
    }
  }
class ATMMachine
  {
    public static void main(String args[])
    {
      Account a=new Account();
      a.setdetails();
      a.deposit();
      a.withdraw();
      a.checkbalance();
    }
  }
