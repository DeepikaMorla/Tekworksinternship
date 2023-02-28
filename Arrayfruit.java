import java.util.*;
class Arrayfruit
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int size;
      System.out.println("Enter number of fruits in array:");
      size=sc.nextInt();
      String fruitnames[]=new String[size];
      System.out.println("Enter fruits in array:");
      for(int i=0;i<=size-1;i++)
        fruitnames[i]=sc.next();
      displayfruitsnames(fruitnames,size);
    }
    public static void displayfruitsnames(String a[],int b)
    {
    for(String j:a)
      System.out.println(j);
    }
  }
  