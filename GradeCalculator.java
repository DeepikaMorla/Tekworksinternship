import java.util.*;
class GradeCalculator
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int marks[] = new int[6];
      int i;
      float total = 0, average;
      for(i=0; i<6; i++)
        {
          System.out.print("Enter Marks of Subject"+(i+1)+":");
          marks[i] = sc.nextInt();
          total = total + marks[i];
        }
      average = total / 6;
      System.out.println("The Student Grade is ");
      if(average>=80)
      {
        System.out.print("A");
      }
      else if(average>=60 && average<80)
      {
        System.out.print("B");
      }
      else if(average>=40 && average<60)
      {
        System.out.print("C");
      }
      else
      {
        System.out.print("F");
      }
    }
  }