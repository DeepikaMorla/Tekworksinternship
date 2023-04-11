import java.util.*;
class Shape
  {
    String color;
    Shape(String color)
    {
      super();
      this.color=color;
    }
  }
class Rectangle extends Shape
  {
    double length;
    double breadth;
    Rectangle(String color,double length,double breadth)
    {
      super();
      this.color=color;
      this.length=length;
      this.breadth=breadth;
    }
    void getArea()
    {
      double ra=length*breadth;
      System.out.println("Area of rectangle is "+ra);
    }
  }
class Circle extends Shape
  {
    double radius;
    double pi=3.14;
    Circle(String color,double radius,double pi)
    {
      super();
      this.color=color;
      this.radius=radius;
    }
    void getArea()
    {
      double ca=pi*radius*radius;
      System.out.println("Area of circle is "+ca);
    }
  }
class Triangle extends Shape
  {
    double height;
    double base;
    Triangle(String color,double height,double base)
    {
      super();
      this.color=color;
      this.height=height;
      this.base=base;
    }
    void getArea()
    {
      double ta=(height*base)/2;
      System.out.println("Area of triangle is "+ta);
    }
  }
class ShapeMain
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter radius:");
      double radius=sc.nextDouble();
      System.out.println("Enter length and breadth:");
      double length=sc.nextDouble();
      double breadth=sc.nextDouble();
      System.out.println("Enter height and base:");
      double height=sc.nextDouble();
      double base=sc.nextDouble();
      Shape s=new Shape(color);
      Rectangle r=new Rectangle(color,length,breadth);
      r.getArea();
      Circle c=new Circle(color,radius,pi);
      c.getArea();
      Triangle t=new Triangle(color,height,base);
      t.getArea();
    }
  }
