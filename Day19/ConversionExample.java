class ConversionExample
  {
    public static void main(String[] a)
    {
      int i=25;
      String s1=String.valueOf(i);
      double d=56.78;
      String s2=Double.toString(d);
      long l=124567;
      String s3=String.valueOf(l);
      Boolean b=false;
      String s4=Boolean.toString(b);
      System.out.println(s1);
      System.out.println(s2);
      System.out.println(s3);
      System.out.println(s4);
    }
  }