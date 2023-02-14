import java.util.*;
class Leap
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int yr;
      yr = sc.nextInt();
      if(((yr % 4 == 0) && (yr % 100 != 0)) || (yr % 400 == 0))
      {
        System.out.println("Given year is leap year");
      }
      else
      {
        System.out.println("Given year is not a leap year");
      }
    }
  }