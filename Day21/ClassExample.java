class ClassExample
  {
    int var1=10; //non static variable
    static int var2=20; //static variable
    void displayOne() //non static method
    {
      
      System.out.println(var1+"  "+var2+);
    }
    static void inc() //static method
    {
      //var1=var1+1;
      var2=var2+1;
    }
    
  }
class MainClass
  {
    public static void main(String []l)
    {
      ClassExample ce=new ClassExample();
      ClassExample c=new ClassExample();
      //System.out.println(ce.var1+"  "+ClassExample.var2);
      ce.inc();
      c.inc();
      ce.displayOne();
      c.displayOne();
    }
  }
