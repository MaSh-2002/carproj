package carpro;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.Logger;



public class Pcatalog {
	Tenant t= new Tenant();
	private boolean shouldPromptProductName = true; 
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

	private  static List<Category> categories = new ArrayList() {{
		add(new Category("Exterior"));
		add(new Category("Electronics"));
		add(new Category("Interior"));
	}};
	
	private  static List<product> products = new ArrayList() {{
		add(new product("Covers", "Exterior", 60, 1));
		add(new product("Wash", "Exterior", 35, 1));
		add(new product("wheel", "Exterior", 50, 1));
		add(new product("Sunshades", "Exterior", 200, 1));
		add(new product("Bluetooth", "Electronics", 200, 2));
		add(new product("GPS", "Electronics", 150, 2));
		add(new product("Camera", "Electronics", 50, 2)); 
		add(new product("Phone", "Electronics", 25, 2));
		add(new product("light", "Interior", 20, 3));
		add(new product("Organizers", "Interior", 70, 3));
		add(new product("Seat", "Interior", 500, 3));
		add(new product("Mirrors", "Interior", 20, 3));
	}};

	public static List<product> getproducts() {
        return products;
    }
	

	public static List<Category> getcategories() {
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
		
		product myProduct = new product(name, myCategor.getName(), price, categoryId);
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
	    for (product product : products) {
	        if (product.typeid == id) {
	            System.out.println(product.name);
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

	    for (product product : products) {
	        if (id.equals(product.name)) {
	        	 logger.info(product.name);
	        	 logger.info(product.price + "$");
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
	                main.mainMenu();  // Go back to the main menu
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

	    for (product product : products) {
	        if (product.name.equalsIgnoreCase(searchQuery)) {
	            search = 1;
	            logger.info(product.name);
	            System.out.println(product.price);
	            logger.info(product.type);

	          
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
	public static void buy(product product,String modle, String date,int i) {
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
	                System.out.println("The selected date is not available. Please choose another date.");
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
	                main.start();  
	            } else {
	            	 logger.info("Invalid input. Returning to main menu...");
	                main.start();  
	            }
		}
	        }
		    
	    }
	}
		
		
		

		
	

	public static boolean deleteproduct (String name) {
		boolean isRemoved= false;
		for (product prod : products) {
			
	if(name.equalsIgnoreCase(prod.name))	{

		product productToRemove = new product(prod.name,prod.type,prod.price,prod.typeid);	
		
		 isRemoved = products.remove(productToRemove);	
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
	
	 isRemoved = categories.remove(categoryToRemove);	
	 isRemoved= true;
	}

}
	return isRemoved;  

}




public static void updateproduct(int id ,String name , int price ,int typeid) {
	
	for (product product : products) {
		if (product.pid == id) {
			product.name=name;
			product.price=price;
			product.typeid=typeid;
		}
	}
	
	
}
}
