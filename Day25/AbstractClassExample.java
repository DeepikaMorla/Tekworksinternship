// abstract class concept
abstract class Bank
  {
    static int x=10;
    int u=34;
    double intrestRate()
    {
      return 0;
    }
    void AnnualProfit()
    {
      
    }
  }
class SBI extends Bank
  {
    double intrestRate()
    {
      return 9.75;
    }
    void AnnualProfit()
    {
      System.out.println("this year got 30% profit");
    }
  }
class ICICI extends Bank
  {
    double intrestRate()
    {
      return 7.69;
    }
    void AnnualProfit()
    {
      System.out.println("this year got 17% profit");
    }
  }
class AbstractClassExample
  {
    public static void main(String p[])
    {
      //Bank b=new Bank();
      SBI sbi=new SBI();
      System.out.println(sbi.intrestRate());
      sbi.AnnualProfit();
      ICICI icici=new ICICI();
      System.out.println(icici.intrestRate());
      icici.AnnualProfit();
    }
  }
