import java.util.*;
class Airthmeticfun
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter any two numbers:");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println(Add(a,b));
      int m=Sub();
      System.out.println(m);
      Mul(a,b);
      Div();
    }
    //Addition
    public static int Add(int a, int b)
    {
      return a + b;
    }
    //Substraction
    public static int Sub()
    {
      int a=10, b=5;
      return a - b;
    }
    //Multiplication
    public static void Mul(int a,int b)
    {
      int c = a * b;
      System.out.println(c);
    }
    //Division
    public static void Div()
    {
      double a=9.0,b=3.0,c;
      c=a/b;
      System.out.println(c);
    }
  }
