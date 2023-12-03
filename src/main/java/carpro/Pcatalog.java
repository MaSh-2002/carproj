package carpro;

import java.util.*;



public class Pcatalog {
	private boolean shouldPromptProductName = true; // Flag to control prompting for product name

	public static int pagenum;
	public int search = 0;
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
		// TODO Auto-generated constructor stub
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

	
	public static void veiwcatalogs() {/// veiw the catalogs
		pagenum = 1;
		for (Category category : categories) {
	
	System.out.println(category.toString());

}
		System.out.print("Enter catagory name:");
		Scanner scanner = new Scanner(System.in);
		int s = scanner.nextInt();
		veiwproducts(s);
	}

	
	
	public static void veiwproducts(int id) {/// veiw the products
		pagenum = 2;
		for (product product : products) {
			if (product.typeid == id) {
				System.out.println(product.name);
			}
		}

		System.out.print("Enter product name:");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();

		veiwdetails(s);

	}

	
	
	public static void veiwdetails(String id) {/// veiw the details

		pagenum = 3;
		for (product product : products) {

			if (id.equals(product.name)) {

				System.out.println(product.name);
				System.out.println(product.price + "$");
				System.out.println(product.type);

			}

		}

	}

	
	public int getPagenum() {

		return pagenum;
	}

	public void setPagenum(int i) {

		pagenum = i;
	}

	public void searchForProduct(String searchQuery) {
		search = 0;
		pagenum = 4;

		for (product product : products) {
			if (product.name == searchQuery) {
				search = 1;
				System.out.println(product.name);
				System.out.println(product.price);
				System.out.println(product.type);
			}
		}

	}
/*
	public void printcatalogs() {// print catagories for admin
		
		for (Category category : categories) {
		
			System.out.println(category.getName());
			for (product product : products) {
				if (product.typeid == category.getId()) {
					System.out.println(product.name);

					
				}
			}
		}

	}
*/
	
	public static boolean deleteproduct (String name) {
		boolean isRemoved= false;
		for (product prod : products) {
			
	if(name.equalsIgnoreCase(prod.name))	{

		product productToRemove = new product(prod.name,prod.type,prod.price,prod.typeid);	
		
		 isRemoved = products.remove(productToRemove);	
		 isRemoved= true;
		}

	}
		
		return isRemoved;  // Removes the specified object

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
	return isRemoved;  // Removes the specified object

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