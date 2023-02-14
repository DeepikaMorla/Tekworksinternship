import java.util.*;
class alpha
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      char c;
      c = sc.next().charAt(0);
      if((c >= 'a' && c <= 'z') || (c >= 'A' && c>='Z'))
      {
        System.out.println("c is alphabet");
      }
      else{
        System.out.println("c is not alphabet");
      }
    }
  }