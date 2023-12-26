package carpro;

public class product {
	
	public static int idSequence = 0;
	public  String name;
    public  String type;
    public int price,typeid;
    public int pid=0;
    
	public product(String name, String type,int price,int typeid) {
		this.name=name;
		this.type=type;
		this.price=price;
		this.typeid=typeid;
		this.pid = ++idSequence;
	}
	private InstallationDetails installationDetails;

   
    public InstallationDetails getInstallationDetails() {
        return installationDetails;
    }

    public void setInstallationDetails(InstallationDetails installationDetails) {
        this.installationDetails = installationDetails;
    }

	
}
