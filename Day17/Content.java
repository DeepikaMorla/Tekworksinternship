import java.util.*;
class Content
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size:");
      int n=sc.nextInt();
      char a[]=new char[n];
      System.out.println("Enter letters:");
      for(int i=0;i<n;i++)
        a[i]=sc.next().charAt(0);
      String str=new String(a);
      System.out.println(str);
    }
  }