package carpro;

import java.util.logging.Logger;

import java.util.*;


public class Admin {

	private static final Logger logger = Logger.getLogger(Admin.class.getName());	
	
	
	public Admin() {
		
		logger.info("Welcome to Admin Dashboard");
		
	}
public void x() {
		
	
		
	}
public void adminWork() {
	 logger.info("Welcome");
}
//////////

boolean isLoggedIn = true;

public void displayDashboard(List<User> usercont) {
	while (isLoggedIn) {
		logger.info("Welcome to Admin Dashboard Panel");
		logger.info("1 - Show the catalog");
		logger.info("2 - edit catagory");
		logger.info("3 - edit product");
		logger.info("4 - veiw customers");

		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		
		if (choice == 1) {
		    Pcatalog.veiwCatalogs();
		} else if (choice == 2) {
		    logger.info("edit category");
		    logger.info("1 - add");
		    logger.info("2 - delete");
		    int choice2 = scanner.nextInt();

		    if (choice2 == 1) {
		        logger.info("Enter category name:");
		        String s = scanner.nextLine();
		        Pcatalog.addCategory(s);
		    } else if (choice2 == 2) {
		        logger.info("Enter category number:");
		        int st = scanner.nextInt();
		        Pcatalog.deletecatalogs(st);
		    } else {
		        logger.info("Invalid choice. Please choose a valid option.");
		    }
		} else if (choice == 3) {
		    logger.info("edit product");
		    logger.info("1 - add");
		    logger.info("2 - delete");
		    int choice3 = scanner.nextInt();

		    if (choice3 == 1) {
		        logger.info("Enter product name:");
		        int price = scanner.nextInt();
		        logger.info("Enter product price:");
		        String name = scanner.nextLine();
		        logger.info("Enter category number:");
		        int num = scanner.nextInt();
		        Pcatalog.addProduct(price, name, num);
		    } else if (choice3 == 2) {
		        // Handle case 2 for editing product
		    } else {
		        logger.info("Invalid choice. Please choose a valid option.");
		    }
		} else if (choice == 4) {
		    veiwCustomer(usercont);
		} else {
		    logger.info("Invalid choice");
		    displayDashboard(usercont);
		}
		}
}


public void printcatalogs() {
	List<Category> categories = Pcatalog.getCategories();
	List<Product> products = Pcatalog.getProducts();
	
		
		for (Category category : categories) {
		
			 logger.info(category.getName());
			for (Product product : products) {
				if (product.getTypeid()== category.getId()) {
					 logger.info(product.getName());

					
				}
			}
		}	
	

}
public void veiwCustomer(List<User> usercont) {
	
	
	
	
	
	for(User user1: usercont) {
			if(user1.getType().equals(UserType.TENANT)) {
				

			
				 logger.info(user1.getUsername());

	
}


	}


}













}