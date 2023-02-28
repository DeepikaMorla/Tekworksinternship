class Fruitarray
  {
    public static void main(String args[])
    {
      String fruitname[]={"Apple","Mango","Banana"};
      displayFruitNames(fruitname,4);
     
    }
    public static void displayFruitNames(String fn[],int i)
    {
      for(String j:fn)
          System.out.println(j);
    }
  }