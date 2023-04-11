import java.util.*;
class MedicineImp implements MedicineInterface{
  ArrayList<MedicineData> medarr=new ArrayList<>();
  public void insert(){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter medicine details like name,company name,price,quantity");
    String name=s.nextLine();
    String cname=s.nextLine();
    double price=s.nextDouble();
    int quantity=s.nextInt();
    medarr.add(new MedicineData(name,cname,price,quantity));
  }
  public void delete(){
    Scanner s=new Scanner(System.in);
    if(medarr.size()==0){
      System.out.println("No medicine is available to delete");
    }
    else{
      String verify=null;
      System.out.println("Enter medicine name to delete medicine");
      String mname=s.nextLine();
      for(MedicineData m:medarr){
        if(m.getMedname().equals(mname))
          medarr.remove(m);
        verify="medicine found";
        break;
      }
      if(verify==null)
        System.out.println("medicine not found with this name");
    }
  }
  public void search(){
    Scanner s=new Scanner(System.in);
    if(medarr.size()==0){
      System.out.println("no medicine is available to search");
    }
    else{
      String verify1=null;
      System.out.println("Enter medicine name to search");
      String mname=s.nextLine();
      for(MedicineData m:medarr){
        if(m.getMedname().equals(mname))
          System.out.println(m.getMedname()+" "+m.getComname()+" "+m.getMedprice()+" "+m.getQuan());
        verify1="medicine found";
        break;
      }
      if(verify1==null)
        System.out.println("medicine not available with this name");
    }
  }
  public void display(){
    if(medarr.size()==0){
      System.out.println("no medicines available");
    }
    else{
      Iterator itr=medarr.iterator();
      while(itr.hasNext()){
        System.out.println(itr.next());
      }
    }
  }
}