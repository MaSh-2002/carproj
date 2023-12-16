package carpro;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.*;

public class testcatalog {
	
	Pcatalog g;
	String s= "wheel";
	
	public testcatalog() {
		g=new Pcatalog();
	
	
		
	} 

@Given("the user is on the product catalog page")
public void the_user_is_on_the_product_catalog_page() {
    
    g.veiwCatalogs();///1

	
	
	
}

@When("the user selects a category \\(e.g., Interior)")
public void the_user_selects_a_category_e_g_interior() {
	
	
g.veiwproducts(1);


}

@Then("the system should display a list of products in that category")
public void the_system_should_display_a_list_of_products_in_that_category() {
  
    assertTrue(g.getPagenum() == 2);
	
	

}

@Given("the user is on the products page")
public void the_user_is_on_the_products_page() {
   
	g.setPagenum(2);
	}

@When("the user selects a specific product")
public void the_user_selects_a_specific_product() {
    g.veiwdetails("wheel"); // Replace "wheel" with a valid product name

}

@Then("the system should display detailed information including description, images, price, and availability status")
public void the_system_should_display_detailed_information_including_description_images_price_and_availability_status() {
  
    assertTrue(g.getPagenum() == 3);

	
	
}


@When("the user go to srarch page")
public void the_user_go_to_srarch_page() {
   g.setPagenum(4);
}

@When("the user enters a search query")
public void the_user_enters_a_search_query() {
	  g.searchForProduct("wheel");
}

@Then("the system should display relevant products matching the search query")
public void the_system_should_display_relevant_products_matching_the_search_query() {
	   assertTrue(g.search==1);
}


/*
@When("the user enters a search query {string}")
public void the_user_enters_a_search_query() {
    g.searchForProduct("wheel"); // Method to simulate user entering a search query
}

@Then("the system should display relevant products matching the search query")
public void the_system_should_display_relevant_products_matching_the_search_query() {
    assertTrue(g.search==1);
    // Add assertions or validation logic to verify the relevant products
}*/

}
