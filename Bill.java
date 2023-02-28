import java.util.*;
class Bill
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int units;
      System.out.println("Enter units:");
      units = sc.nextInt();
      double billpay,surcharge,totalamt;
      if(units <= 50)
      {
        billpay = units * 0.50;
      }
      else if(units <= 150)
      {
        billpay = 25 + ((units - 50)*0.75);
      }
      else if(units <= 250)
      {
        billpay = 100 + ((units - 150)*1.20);
      }
      else
      {
        billpay = 220 + ((units - 250)*1.50);
      }
      surcharge = billpay * 0.20;
      totalamt = billpay + surcharge;
      System.out.println("Electricity Bill = Rs."+totalamt);
    }
  }