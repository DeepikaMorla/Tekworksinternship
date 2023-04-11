class MedicineData{
  String medname;
  String comname;
  double medprice;
  int quan;
  MedicineData(String name, String cname, double price, int quantity){
    medname=name;
    comname=cname;
    medprice=price;
    quan=quantity;
  }
  public String getMedname(){
    return medname;
  }
  public String getComname(){
    return comname;
  }
  public double getMedprice(){
    return medprice;
  }
  public int getQuan(){
    return quan;
  }
  public String toString(){
    return medname+" "+comname+" "+medprice+" "+quan;
  }
}
