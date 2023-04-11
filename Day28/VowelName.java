class NameException extends Exception
  {
    String str;
    public NameException(String str)
    {
      this.str=str;
    }
    String get()
    {
      return str;
    }
  }
class PersonName
  {
    private String name;
    public PersonName(String name)
    {
      this.name=name;
    }
    public void checkName() throws NameException
    {
      if(name.startsWith("a") || name.startsWith("e") || name.startsWith("i") || name.startsWith("o") || name.startsWith("u") || name.startsWith("A") || name.startsWith("E") || name.startsWith("I") || name.startsWith("O") || name.startsWith("U"))
      {
        System.out.println("Valid name");
      }
      else
      {
        throw new NameException("Invalid name");
      }
    }
  }
class VowelName
  {
    public static void main(String args[])
    {
      PersonName abhi=("Abhi");
      PersonName sonu=("sonu");
      try
        {
          abhi.checkName();
          sonu.checkName();
        }
      catch(NameException e)
        {
          System.out.println("Error:"+e.get());
        }
    }
  }
