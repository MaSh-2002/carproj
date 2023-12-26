package carpro;

public class Order {
	private String carMakeModel;
	private String dateTime1;

	 private String name;

	    private int price;
    public  Order( String carMakeModel,String dateTime1, String name, int price) {
    	this.price=price;
    	this.carMakeModel=carMakeModel;
    	this.dateTime1=dateTime1;
    	this.name=name;
    }
    
    
    
 public String getCarmakemodel() {
	 
	return carMakeModel; 
 }
 public String getdateTime1() {
	 
		return dateTime1; 
 }
 public String toString() {
		return name + ":\n car Model" + carMakeModel +"\ndate:"+dateTime1+"\nprice"+price;
	}

public String getName() {
    return name;
}

public void setName(String newName) {
    this.name = newName;
}

public int getPrice() {
    return price;
}

public void setPrice(int newPrice) {
    this.price = newPrice;
}
}
