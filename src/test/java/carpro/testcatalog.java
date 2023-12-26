package carpro;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import io.cucumber.java.en.*;

public class testcatalog {
	  private static final Logger logger = Logger.getLogger(testcatalog.class.getName());
	Pcatalog g;
	String s= "wheel";
	
	public testcatalog() {
		g=new Pcatalog();
	
	
		
	} 

@Given("the user is on the product catalog page")
public void the_user_is_on_the_product_catalog_page() {
    logger.info("User is on the product catalog page");
	
}

@When("the user selects a category \\(e.g., Interior)")
public void the_user_selects_a_category_e_g_interior() {
	
	
g.veiwproducts(3,1);


}

@Then("the system should display a list of products in that category")
public void the_system_should_display_a_list_of_products_in_that_category() {
  
	assertEquals(2, g.getPagenum());
	
	

}

@Given("the user is on the products page")
public void the_user_is_on_the_products_page() {
	 logger.info("User is on the product products page");

	g.setPagenum(2);
	}

@When("the user selects a specific product")
public void the_user_selects_a_specific_product() {
    g.veiwdetails("wheel",1); 

}

@Then("the system should display detailed information including description, images, price, and availability status")
public void the_system_should_display_detailed_information_including_description_images_price_and_availability_status() {
  
	assertEquals(3,g.getPagenum());

	
	
}


@When("the user go to srarch page")
public void the_user_go_to_srarch_page() {
   g.setPagenum(4);
}

@When("the user enters a search query")
public void the_user_enters_a_search_query() {
	  g.searchForProduct("wheel",1);
}

@Then("the system should display relevant products matching the search query")
public void the_system_should_display_relevant_products_matching_the_search_query() {
	assertEquals(1,g.getSearch());
}




}
