class ConstructorStatic
  {
    int a=5;
    static int b=10;
    ConstructorStatic(int c)
    {
      int sum=a+b;
      //static int d=35;
      System.out.println("sum is:"+sum);
      System.out.println(c);
    }
    void getValues()
    {
      System.out.println("A value:"+a);
      System.out.println("B Value:"+b);
    }
  }
class StaticMain
  {
    public static void main(String args[])
    {
      ConstructorStatic cs=new ConstructorStatic(20);
      cs.getValues();
    }
  }
