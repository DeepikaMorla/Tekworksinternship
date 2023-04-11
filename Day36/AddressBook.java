import java.util.*;
class AddressBook
  {
    public static void main(String args[])
    {
      HashMap<Hno, String> hm=new HashMap<Hno, String>();
      hm.put(new Hno("58-5-18", "Ranga Rao Street", 520010),"deepika");
      hm.put(new Hno("58-5-19", "Dhanaya Street", 520002), "chintu");
      for(Map.Entry m:hm.entrySet()){
        System.out.println(m.getKey()+" "+m.getValue());
      }
      System.out.println (hm.remove ("58-5-18"));
    }
  }
class Hno
  {
    private String houseno;
    private String street;
    private int pincode;
    public Hno(String h, String s, int pin)
    {
      this.houseno=h;
      this.street=s;
      this.pincode=pin;
    }
    public String getHouseno(){
      return houseno;
    }
    public String getStreet(){
      return street;
    }
    public int getPincode(){
      return pincode;
    }
    public String toString(){
      return "houseno: "+houseno+"street: "+street+"pincode: "+pincode;
    }
  }
