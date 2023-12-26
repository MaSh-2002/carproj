package carpro;

public class Product {
	
	public static final int ID_SEQUENCE = 0;
	   
	 private String name;

	    
	    public String getName() {
	        return name;
	    }

	    public void setName(String newName) {
	        name = newName;
	    }

	    private String type;

	   
	    public String getType() {
	        return type;
	    }

	    public void setType(String newType) {
	        type = newType;
	    }
	    
	    private int price = 0;

	   
	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int newPrice) {
	        price = newPrice;
	    }
	    private static int typeid = 0;

	   
	    public static int getTypeid() {
	        return typeid;
	    }

	    static void setTypeid(int newTypeid) {
	        typeid = newTypeid;
	    }
    private static int pid = 0;

  
    public static int getPid() {
        return pid;
    }

    static void setPid(int pid) {
        Product.pid = pid;
    }
    
	public Product(String name, String type,int price,int typeid) {
		this.name=name;
		this.type=type;
		this.price=price;
		this.typeid=typeid;
	
	}
	private InstallationDetails installationDetails;

   
    public InstallationDetails getInstallationDetails() {
        return installationDetails;
    }

    public void setInstallationDetails(InstallationDetails installationDetails) {
        this.installationDetails = installationDetails;
    }

	
}
