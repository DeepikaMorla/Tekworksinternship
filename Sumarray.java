class Sumarray
  {
    public static void SumofArray(int n[])
    {
      int sum = 0;
      int a = n[0];
      for(int i = 0; i < n.length; i++)
        {
          sum = sum + n[i];
        }
      System.out.println("Sum of array elements are: "+sum);
    }
    public static void main(String args[])
    {
      int n[] = {12, 24, 56};
      SumofArray(n);
    }
  }