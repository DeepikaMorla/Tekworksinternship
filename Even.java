class Even
  {
    public static void main(String args[])
    {
      int i = 1,n = 100;
      System.out.println("List of all even numbers between 1 to 100: ");
      while(i <= n)
        {
          if(i % 2 == 0)
          {
            System.out.print(i+" ");
          }
          i++;
        }
    }
  }