import java.util.*;
class Bitwise
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int a,b;
      a  = sc.nextInt();
      b = sc.nextInt();
      System.out.println("a & b = "+(a&b));
      System.out.println("a ^ b = "+(a^b));
      System.out.println("a | b = "+(a|b));
      System.out.println("~ a = "+(~a));
      System.out.println("a >> 2 = "+(a>>2));
      System.out.println("a << 2 = "+(a<<2));
    }
  }