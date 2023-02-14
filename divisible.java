import java.util.*;
class Div
  {
    public static void main(String args[]){
      Scanner sc= new Scanner(System.in);
      int a;
      a = sc.nextInt();
      if(a % 5 == 0 && a % 11 == 0)
      {
        System.out.println("Number is divisible by both 5 and 11");
      }
      else{
        System.out.println("Number is not divisible by 5 and 11");
      }
    }
  }