import java.util.*;
class Sumdigits  
{  
  public static void main(String args[])  
  {  
    int num, digit, sum = 0;  
    Scanner sc = new Scanner(System.in);  
    System.out.print("Enter the number: ");  
    num = sc.nextInt();  
    while(num > 0)  
    {  
      //finds the last digit of the given number    
      digit = num % 10;  
      //adds last digit to the variable sum  
      sum = sum + digit;  
      //removes the last digit from the number  
      num = num / 10;  
    }  
    System.out.println("Sum of Digits: "+sum);  
  }  
}  