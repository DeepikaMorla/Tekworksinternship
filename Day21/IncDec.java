class IncDec
  {
    int x=5;
    static int y=10;
    static void displayIncrement()
    {
      y=y+1;
      System.out.println(y);
    }
    void displayDecrement()
    {
      x=x-1;
      y=y-1;
      System.out.println(x+"   "+y);
    }
  }
class DisplayResult
  {
    public static void main(String args[])
    {
      IncDec id=new IncDec();
      IncDec.displayIncrement();
      id.displayDecrement();
    }
  }
