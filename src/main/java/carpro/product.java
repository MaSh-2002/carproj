package carpro;

public class product {
	
	public static int idSequence = 0;
	public  String name;
    public  String type;
    public int price;
	public int typeid;
    private static int pid = 0;

  
    public static int getPid() {
        return pid;
    }

    static void setPid(int pid) {
        product.pid = pid;
    }
    
	public product(String name, String type,int price,int typeid) {
		this.name=name;
		this.type=type;
		this.price=price;
		this.typeid=typeid;
		product.pid = ++idSequence;
	}
	private InstallationDetails installationDetails;

   
    public InstallationDetails getInstallationDetails() {
        return installationDetails;
    }

    public void setInstallationDetails(InstallationDetails installationDetails) {
        this.installationDetails = installationDetails;
    }

	
}
