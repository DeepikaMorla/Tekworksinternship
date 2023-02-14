import java.util.Scanner;
class Product
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String pname = sc.next();
      System.out.println("Product Name is "+pname);
      float price = sc.nextFloat();
      System.out.println("Product Price: "+price);
      float amt = (price*10)/100;
      System.out.println("Total Amount: "+amt);
    }
  }