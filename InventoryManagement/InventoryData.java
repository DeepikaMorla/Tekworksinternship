class InventoryData
  {
    String pname;
    String cname;
    double price;
    InventoryData(String name, String company, double p){
      pname=name;
      cname=company;
      price=p;
    }
	public String getPname() {
		return pname;
	}
	public String getCname() {
		return cname;
	}
	public double getPrice() {
		return price;
	}
    public String toString(){
      return pname+" "+cname+" "+price;
    }
  }
