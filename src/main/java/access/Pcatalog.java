package access;

public class Pcatalog {
	   public  int pagenum;
	   product[] products = {new product("wheel","a",5,1),new product("door","b",5,2),new product("light","c",5,3)};
		public Pcatalog( ) {
			// TODO Auto-generated constructor stub
			pagenum=1;
		}
	
	public void veiwcatalogs(int id) {///veiw the catalogs
		pagenum=1;
		for(int i=0;i<3;i++) {
			System.out.println(products[i].type);

		}
	}
	
public void veiwproducts(int id) {///veiw the products
	pagenum=2;
	for(int i=0;i<3;i++) {
		if(products[i].typeid==id) {
		System.out.println(products[i].name);
		}
	}
	}

public void veiwdetails(String id) {///veiw the details
	pagenum=3;
	for(int i=0;i<3;i++) {
		if(products[i].name==id) {
		System.out.println(products[i].name);
		System.out.println(products[i].price);
		System.out.println(products[i].type);
		}
	}
}

}
