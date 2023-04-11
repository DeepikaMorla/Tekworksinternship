import java.util.*;
class ConstructorExample
  {
    int num1;
    int num2;
    ConstructorExample(int num1,int num2)
    {
      this.num1=num1;
      this.num2=num2;
      //System.out.println("this is constructor");
    }
    void getNum1(int num1)
    {
      this.num1=num1;
      System.out.println(num1);
    }
    void getNum2()
    {
      System.out.println(num2);
    }
    void setNum1()
    {
      Scanner sc=new Scanner(System.in);
      num1=sc.nextInt();
    }
    void setNum2()
    {
      Scanner sc=new Scanner(System.in);
      num2=sc.nextInt();
    }
  }
class ConstructorMain
  {
    public static void main(String args[])
    {
      ConstructorExample ce1=new ConstructorExample(45,9); //calling constructor
      ConstructorExample ce2=new ConstructorExample(4,93); 
      //ce.setNum1();
      //ce.setNum2();
      ce1.getNum1(300);
      ce2.getNum1(450);
    }
  }