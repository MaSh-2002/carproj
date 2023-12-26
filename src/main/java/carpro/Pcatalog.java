package carpro;



import java.util.*;
import java.util.logging.Logger;



public class Pcatalog {
	Tenant t= new Tenant();
	
	   

	    public static List<Category> getCategories() {
	        return categories;
	    }

	    public static List<Product> getProducts() {
	        return products;
	    }
	
	private static final Logger logger = Logger.getLogger(Pcatalog.class.getName());
	private static boolean buycheck = false;

    public static boolean isBuycheck() {
        return buycheck;
    }

    public static void setBuycheck(boolean buycheck) {
    	Pcatalog.buycheck = buycheck;
    }
	private static int pagenum = 0;

 
    public static int getPagenum1() {
        return pagenum;
    }

    static void setPagenum1(int pagenum) {
    	Pcatalog .pagenum = pagenum;
    }
	private static int search = 0;

   
    public static int getSearch() {
        return search;
    }

    static void setSearch(int search) {
    	Pcatalog.search = search;
    }
    private static List<Order> orders = new ArrayList<>();

    public static List<Order> getOrders() {
        return orders;
    }

    
    private static final String EXTERIOR_CATEGORY_NAME = "Exterior";
    private static final String ELECTRONICS_CATEGORY_NAME = "Electronics";
    private static final String INTERIOR_CATEGORY_NAME = "Interior";

    private static List<Category> categories;
    private static List<Product> products;

    static {
        initializeCategories();
        initializeProducts();
    }

    private static void initializeCategories() {
        categories = new ArrayList<>();
        categories.add(new Category(EXTERIOR_CATEGORY_NAME));
        categories.add(new Category(ELECTRONICS_CATEGORY_NAME));
        categories.add(new Category(INTERIOR_CATEGORY_NAME));
    }

    private static void initializeProducts() {
        products = new ArrayList<>();
        products.add(new Product("Covers", EXTERIOR_CATEGORY_NAME, 60, 1));
        products.add(new Product("Wash", EXTERIOR_CATEGORY_NAME, 35, 1));
        products.add(new Product("Wheel", EXTERIOR_CATEGORY_NAME, 50, 1));
        products.add(new Product("Sunshades", EXTERIOR_CATEGORY_NAME, 200, 1));
        products.add(new Product("Bluetooth", ELECTRONICS_CATEGORY_NAME, 200, 2));
        products.add(new Product("GPS", ELECTRONICS_CATEGORY_NAME, 150, 2));
        products.add(new Product("Camera", ELECTRONICS_CATEGORY_NAME, 50, 2));
        products.add(new Product("Phone", ELECTRONICS_CATEGORY_NAME, 25, 2));
        products.add(new Product("Light", INTERIOR_CATEGORY_NAME, 20, 3));
        products.add(new Product("Organizers", INTERIOR_CATEGORY_NAME, 70, 3));
        products.add(new Product("Seat", INTERIOR_CATEGORY_NAME, 500, 3));
        products.add(new Product("Mirrors", INTERIOR_CATEGORY_NAME, 20, 3));
    }

 


	public static List<Product> getProducts1() {
        return products;
    }
	

	public static List<Category> getCategories1() {
        return categories;
    }
	public Pcatalog() {
	
		pagenum = 1;
	}
	
	public static boolean addCategory(String name) {
		boolean added =true;
		categories.add(new Category(name));
	       added =true;
		return added;
	}
	
	public static boolean addProduct(int price, String name, int categoryId) {
		boolean  added =false;
		Category myCategor = null;
		for (Category category : categories) {
			if(category.getId() == categoryId) {
				myCategor = category;
			}
		}
		
		Product myProduct = new Product(name, myCategor.getName(), price, categoryId);
		added=products.add(myProduct);
		return added;
	}

	
	public static void veiwCatalogs() {
	    pagenum = 1;

	   logger.info("*** To search for a product enter 's'");

	   
	    for (Category category : categories) {
	    	 logger.info(category.toString());
	    }

	   
	    int s = 0;
	    boolean validInput = false;
	    Scanner scanner = new Scanner(System.in);

	    while (!validInput) {
	    	 logger.info("Enter category name or ID:");
	        String input = scanner.nextLine().trim();
	        if (input.equals("s")) {
	        	 logger.info("Enter product name");
	            Scanner sc = new Scanner(System.in);

	            String in = sc.nextLine();
	            searchForProduct(in,0);

	        } else {
	            try {
	                s = Integer.parseInt(input);
	                validInput = true;
	            } catch (NumberFormatException e) {
	               
	                for (Category category : categories) {
	                    if (category.getName().equalsIgnoreCase(input)) {
	                        s = category.getId();
	                        validInput = true;
	                        break;
	                    }
	                }

	                if (!validInput) {
	                	 logger.info("Invalid input. Please enter a valid category name or ID.");
	                }
	            }
	        }
	    }

	    veiwproducts(s,0);

	    
	    boolean continueEnteringProducts = true;
	    while (continueEnteringProducts) {
	    	 logger.info("Enter product name (or type 'exit' to finish entering products): ");
	        String productName = scanner.nextLine().trim();

	        if ("exit".equalsIgnoreCase(productName)) {
	            continueEnteringProducts = false;
	        } else {
	            veiwdetails(productName,0);

	           
	            if (pagenum == 1 || pagenum == 3) {
	                break;
	            }
	        }
	    }
	    Tenant t= new Tenant();
	   
	    if (pagenum == 2) {
	        veiwCatalogs();
	    } else if (pagenum == 1) {
	        t.viewProfile(); 
	    }
	}
	
	
	public static void veiwproducts(int id,int i) {
	    pagenum = 2;
	    for (Product product : products) {
	        if (product.typeid == id) {
	            logger.info(product.name);
	        }
	    }


	if(i==0){	
	   
		 logger.info("Enter product name (or type '0' to return to catalogs): ");
	    Scanner scanner = new Scanner(System.in);
	    String productName = scanner.nextLine().trim();

	    if ("0".equals(productName)) {
	        veiwCatalogs(); 
	    } else {
	        veiwdetails(productName,0);
	    }


	}
		
	}
	
	public static void veiwdetails(String id, int i) {
	    pagenum = 3;
	    boolean productFound = false;

	    for (Product product : products) {
	        if (id.equals(product.name)) {
	        	 logger.info(product.name);
	        	 logger.info(String.format("%d$", product.price));
	        	 logger.info(product.type);

			if(i==0){
				 logger.info("Enter 1 if you want to buy this product ");
				 logger.info("Enter 2 to return to the main menu ");
	            Scanner sc = new Scanner(System.in);
	            int si = sc.nextInt();

	            if (si == 1) {
	                buy(product,null,null,0);
	            } else if (si == 2) {
	            	 logger.info("Returning to main menu...");
	                Main.mainMenu();  // Go back to the main menu
	                return;
	            } else {
	            	 logger.info("Invalid input. Returning to catalogs.");
	                veiwCatalogs();
	                return;
	            }

	            productFound = true;
	            break;

		}
	        }

		    
	    }
	  
if(i==0){
	    if (!productFound) {
	    	 logger.info("Product not found.");
	    }
	}
	}
	public int getPagenum() {

		return pagenum;
	}

	public void setPagenum(int i) {

		pagenum = i;
	}

	public static void searchForProduct(String searchQuery,int i ) {
	    search = 0;
	    pagenum = 4;
	    boolean productFound = false;

	    for (Product product : products) {
	        if (product.name.equalsIgnoreCase(searchQuery)) {
	            search = 1;

	            // Log product details only if the product type is not empty
	            logger.info(product.name);

	            if (!product.type.isEmpty()) {
	                logger.info(String.format("Product price: %d", product.price));
	                logger.info(product.type);
	            }

	            productFound = true;
	            break;
	        }
	    }
	    
if(i==0){
	    if (productFound) {
	        
	    	 logger.info("Enter 'buy' to purchase the product, or 'back' to return to categories: ");
	        Scanner scanner = new Scanner(System.in);
	        String input = scanner.nextLine().trim();

	        if ("buy".equalsIgnoreCase(input)) {
	            buy(products.get(0),null,null,0);
	        } else if ("back".equalsIgnoreCase(input)) {
	            veiwCatalogs();
	        } else {
	            
	        	 logger.info("Invalid input. Returning to categories.");
	            veiwCatalogs();
	        }
	    }
	}
	}
	public static void buy(Product product,String modle, String date,int i) {
	    Scanner scanner = new Scanner(System.in);
String model;
		if(i==0){
	    logger.info("Enter your car model");
	     model = scanner.nextLine();
		}else{model=modle;}
	    int f = 2;

	    while (f == 0 || f == 2) {
 String userInput;
		    if(i==0){
	        logger.info("Enter the installation date you want (and we will tell you if it's available) ");
	        logger.info("Enter the date and time (YYYY-MM-DD/H:mm): ");
	        userInput = scanner.nextLine();
		    }else{userInput=date;}
	        for (Order order1 : orders) {
	            if (userInput.equalsIgnoreCase(order1.getdateTime1())) {
	            	 logger.info("The selected date is not available. Please choose another date.");
	                f = 0;
	                break;
	            }
	        }

	        if (f == 2) {
	            Order order = new Order(model, userInput, product.name, product.price);
	            orders.add(order);
	            logger.info("The order has been accepted.");
			    buycheck=true;
if(i==0){
	           
	 logger.info("Options:");
	 logger.info("1. Return to catalog");
	 logger.info("2. Go back to main menu");

	            int choice = scanner.nextInt();
	            if (choice == 1) {
	                veiwCatalogs();
	            } else if (choice == 2) {
	                Main.start();  
	            } else {
	            	 logger.info("Invalid input. Returning to main menu...");
	                Main.start();  
	            }
		}
	        }
		    
	    }
	}
		
		
		

		
	

	public static boolean deleteproduct (String name) {
		boolean isRemoved= false;
		for (Product prod : products) {
			
	if(name.equalsIgnoreCase(prod.name))	{

		Product productToRemove = new Product(prod.name,prod.type,prod.price,prod.typeid);	
		
		products.remove(productToRemove);
		 isRemoved= true;
		}

	}
		
		return isRemoved;  
	}
	

	
	
public static boolean deletecatalogs (int id) {
	boolean isRemoved= false;
	for (Category category : categories) {
		
if(category.getId()==id)	{

	Category categoryToRemove = new Category(category.getName());	
	
	categories.remove(categoryToRemove);
	 isRemoved= true;
	}

}
	return isRemoved;  

}




public static void updateproduct(int id ,String name , int price ,int typeid) {
	
	for (Product product : products) {
		if (product.getPid() == id) {
			product.name=name;
			product.price=price;
			product.typeid=typeid;
		}
	}
	
	
}
}
