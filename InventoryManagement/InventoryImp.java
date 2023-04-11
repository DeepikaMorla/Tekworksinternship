import java.util.*;
class InventoryImp implements InventoryInterface{
  ArrayList<InventoryData> emparr=new ArrayList<>();
  public void add(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter product details like name,company name,price");
    String pname=s.nextLine();
    String cname=s.nextLine();
    double price=s.nextDouble();
    invarr.add(new InventoryData(pname,cname,price));
  }
  public void remove(){
    Scanner s=new Scanner(System.in);
    if(invarr.size()==0){
      System.out.println("no product is available to remove");
    }
    else{
      String verify=null;
      System.out.println("Enter product name to remove");
      String pname1=s.nextLine();
      for(InventoryData e:invarr)
        {
          if(e.getPname()==pname1)
            invarr.remove(e);
          verify="found";
          break;
        }
      if(verify==null)
        System.out.println("product data not available with this name");
    }
  }
  public void display(){
    if(invarr.size()==0){
      System.out.println("no product is available");
    }
    else{
      Iterator itr=invarr.iterator();
      while(itr.hasNext()){
        System.out.println(itr.next());
      }
    }
  }
  public void check(){
    Scanner s=new Scanner(System.in);
    if(invarr.size()==0){
      System.out.println("no product is available to check");
    }
    else{
      String verify=null;
      System.out.println("Enter product name to check data");
      String pname1=s.nextLine();
      for(InventoryData e:invarr)
        {
          if(e.getPname()==pname1)
            System.out.println(e.getPname()+" "+e.getCname()+" "+e.getPrice());
          verify="found";
          break;
        }
      if(verify==null)
        System.out.println("product data not available with this id");
    }
  }
}