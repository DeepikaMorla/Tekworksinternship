import java.util.*;
class Product
  {
    String name;
    double price;
    int quantity;
    void setName()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter product name:");
      name=sc.nextLine();
    }
    void getName()
    {
      System.out.println("Product name is "+name);
    }
    void setPrice()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter price:");
      price=sc.nextDouble();
    }
    void getPrice()
    {
      System.out.println("Product price is "+price);
    }
    void setQuantity()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter quantity:");
      quantity=sc.nextInt();
    }
    void getQuantity()
    {
      System.out.println("Product quantity is "+quantity);
    }
  }
class PointOfSale
  {
    
  }
class Pointofsalesystem
  {
    public static void main(String args[])
    {
      Product p=new Product();
      p.setName();
      p.getName();
      p.setPrice();
      p.getPrice();
      p.setQuantity();
      p.getQuantity();
    }
  }