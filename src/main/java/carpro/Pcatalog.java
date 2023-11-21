package carpro;
import java.util.Scanner;
public class Pcatalog {
    private boolean shouldPromptProductName = true; // Flag to control prompting for product name

	   public  int pagenum ;
	   public int search =0;
	   product[] products = {new product("wheel","a",5,1),new product("door","b",5,2),new product("light","c",5,3)};
		public Pcatalog( ) {
			// TODO Auto-generated constructor stub
			pagenum=1;
		}
	
	public void veiwcatalogs() {///veiw the catalogs
		pagenum=1;
		for(int i=0;i<3;i++) {
			System.out.println(products[i].type);

		}
		System.out.print("Enter catagory name:");
		Scanner scanner = new Scanner(System.in);
		String s =scanner.nextLine();
		switch(s) {
		case "a":
			veiwproducts(1);
	        break;

		case "b":
			veiwproducts(2);
	        break;

		case "c":
			veiwproducts(3);
	        break;
		default:
            System.out.println("Invalid category! Please enter a valid category (a, b, or c).");
            veiwcatalogs(); // Re-invoke the method to allow the user to enter a valid category
            break;

		}
		
	}
	
public void veiwproducts(int id) {///veiw the products
	pagenum=2;
	for(int i=0;i<3;i++) {
		if(products[i].typeid==id) {
		System.out.println(products[i].name);
		}
	}
	
	System.out.print("Enter product name:");
	Scanner scanner = new Scanner(System.in);
	String s =scanner.nextLine();
	
	/*
	for(int i=0;i<3;i++) {
		if(products[i].typeid==id) {
		
			if(products[i].name==s) {
				
				veiwdetails(s);
			}
		}
		else 		System.out.println("");

	}*/
	
	veiwdetails(s);

	
	}

public void veiwdetails(String id) {///veiw the details

	pagenum=3;
	for(int i=0;i<3;i++) {
		if(id.equals(products[i].name)) {
		System.out.println(products[i].name);
		System.out.println(products[i].price);
		System.out.println(products[i].type);

		}
		
	
}
	
}
public int getPagenum() {
	
	return pagenum;
}
 public void setPagenum(int i) {
	 
	pagenum=i;
 }
public void searchForProduct(String searchQuery){
	search=0;
	pagenum=4;
		
		for(int i=0;i<3;i++) {
			if(products[i].name==searchQuery) {
				search=1;
				System.out.println(products[i].name);
				System.out.println(products[i].price);
				System.out.println(products[i].type);
			}
		}
	
}


}
