import java.util.*;
class ShiftString
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter data for string:");
      String str=sc.nextLine();
      char strarr[]=str.toCharArray();
      System.out.println("Enter number of positions:");
      int n=sc.nextInt();
      LeftShift(strarr,n);
      RightShift(strarr,n);
    }
    static void LeftShift(char strarr[],int n)
    {
      for(int k=1;k<=n;k++)
        {
          char temp=strarr[strarr.length-1];
          for(int l=strarr.length-2;l>=0;l--)
            strarr[l+1]=strarr[l];
          strarr[0]=temp;
        }
      String s=new String(strarr);
      System.out.println("left shift is:"+s);
    }
    static void RightShift(char strarr[], int n)
    {
      for(int k=1;k<=n;k++)
        {
          char temp=strarr[0];
          for(int l=0;l<strarr.length-1;l++)
            strarr[l+1]=strarr[l];
          strarr[strarr.length-1]=temp;
        }
      String s1=new String(strarr);
      System.out.println("right shift is:"+s1);
    }
    
  }