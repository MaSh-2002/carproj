package carpro;

import java.util.logging.Logger;

import java.util.*;


public class Admin {

	private static final Logger logger = Logger.getLogger(Admin.class.getName());	
	Pcatalog catalog;
	
	public Admin() {
		
		logger.info("Welcome to Admin Dashboard");
		
	}

public void adminWork() {
	System.out.println("welcome ");
}
//////////

boolean isLoggedIn = true;

public void displayDashboard(ArrayList<User> usercont) {
	while (isLoggedIn) {
		logger.info("Welcome to Admin Dashboard Panel");
		logger.info("1 - Show the catalog");
		logger.info("2 - edit catagory");
		logger.info("3 - edit product");
		logger.info("4 - veiw customers");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		switch (choice) {
			case 1:
				Pcatalog.veiwCatalogs();
				break;
				
				
				
			case 2:
				logger.info("edit catagory");
				logger.info("1 - add");
				logger.info("2 - delete");
				int choice2 = scanner.nextInt();
				
				switch (choice2) {
					case 1:
						System.out.print("Enter catagory name:");
						
						Scanner sc = new Scanner(System.in);						
                        String s= sc.nextLine();
						Pcatalog.addCategory(s);
						break;
					case 2:
						System.out.print("Enter catagory numbers:");

						Scanner scr = new Scanner(System.in);						
                        int st= scr.nextInt();

						Pcatalog.deletecatalogs(st);
						break;	
				}	
				break;


			case 3:
				logger.info("edit product");
				logger.info("1 - add");
				logger.info("2 - delete");
				int choice3 = scanner.nextInt();
				
				switch (choice3) {
					case 1:
						System.out.print("Enter product name:");
						int price = scanner.nextInt(); 
						System.out.print("Enter product price:");
						String name  =scanner.nextLine();
						System.out.print("Enter catagory number:");
						int num = scanner.nextInt(); 

					Pcatalog.addProduct(price, name, num);
						break;
					case 2:
						break;	
				}
			case 4:
				veiwCustomer(usercont);
				break;

			default:
				logger.info("Invalid choice");
				displayDashboard(usercont);
				break;
		}}
}


public void printcatalogs() {// print catagories for admin
	List<Category> categories= catalog.getcategories();
	
	List<product> products = catalog.getproducts();
	
		
		for (Category category : categories) {
		
			System.out.println(category.getName());
			for (product product : products) {
				if (product.typeid == category.getId()) {
					System.out.println(product.name);

					
				}
			}
		}	
	

}
public void veiwCustomer(ArrayList<User> usercont) {
	
	
	
	
	
	for(User user1: usercont) {
			if(user1.getType().equals(UserType.TENANT)) {
				

			
				System.out.println(user1.getUsername());

	
}


	}


}













}