package carpro;

public class Product {
	
	public static final int idSequence = 0;
	   
	public  String name;
    public  String type;
    public int price;
	public int typeid;
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
