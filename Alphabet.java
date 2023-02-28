import java.util.*;
class Alpha
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      char c;
      c = sc.next().charAt(0);
      System.out.println("Enter an alphabet: "+c);
      if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
      {
        System.out.println("c is vowel");
      }
      else
      {
        System.out.println("c is consonant");
      }
    }
  }