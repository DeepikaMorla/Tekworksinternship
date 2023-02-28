import java.util.*;
class Marks
  {
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int phy,mat,com,che,eng;
      phy = sc.nextInt();
      mat = sc.nextInt();
      com = sc.nextInt();
      che = sc.nextInt();
      eng = sc.nextInt();
      float per = ((phy+mat+com+che+eng)/5);
      if(per > 90)
      {
        System.out.println("Grade A");
      }
      else if(per > 80)
      {
        System.out.println("Grade B");
      }
      else if(per > 70)
      {
        System.out.println("Grade C");
      }
      else if(per > 60)
      {
        System.out.println("Grade D");
      }
      else
      {
         System.out.println("Grade F"); 
      }
    }
  }