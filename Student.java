import java.util.Scanner;
class Student
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      String sname = sc.next();
      int snum = sc.nextInt();
      int sub1 = sc.nextInt();
      int sub2 = sc.nextInt();
      int sub3 = sc.nextInt();
      System.out.println("Student Name is "+sname);
      System.out.println("Student Id is"+snum);
      System.out.println("Marks of first subject: "+sub1);
      System.out.println("Marks of second subject: "+sub2);
      System.out.println("Marks of third subject: "+sub3);
      float Avg = sub1+sub2+sub3/3;
      System.out.println("Average of three subjects is "+Avg);
    }
  }