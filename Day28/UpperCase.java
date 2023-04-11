class InvalidNameException extends Exception
  {
    String str;
    public InvalidNameException(String str){
      this.str=str;
    }
    String get(){
      return str;
    }
  }
class Name{
  private String name;
  public Name(String name){
    this.name=name;
  }
  public void uppercase() throws InvalidNameException{
    if(name.charAt(0)==(name.toLowerCase().charAt(0))){
      throw new InvalidNameException("Invalid name:"+name);
    }
    System.out.println("Name is "+name);
  }
}
public class UpperCase
  {
    public static void main(String args[])
    {
      Name deepika=new Name("Deepika");
      Name deepikam=new Name("chintu");
      try{
        deepika.uppercase();
        deepikam.uppercase();
      }
      catch(InvalidNameException e){
        System.out.println("Error:"+e.get());
      }
    }
  }
