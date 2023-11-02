package access;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.*;

public class testcatalog {
	
	Pcatalog g;
	
	public testcatalog() {
		g=new Pcatalog();
	
	
		
	} 

@Given("the user is on the product catalog page")
public void the_user_is_on_the_product_catalog_page() {
    
	g.pagenum=1;
	
	
	
}

@When("the user selects a category \\(e.g., Interior)")
public void the_user_selects_a_category_e_g_interior(int id) {
	
	
g.veiwproducts(id);


}

@Then("the system should display a list of products in that category")
public void the_system_should_display_a_list_of_products_in_that_category() {
  
	assertTrue(g.pagenum==2);
	
	

}

@Given("the user is on the product details page")
public void the_user_is_on_the_product_details_page() {
   
	
	
	g.pagenum=2;
}

@When("the user selects a specific product")
public void the_user_selects_a_specific_product(String id) {
	g.veiwdetails(id);

}

@Then("the system should display detailed information including description, images, price, and availability status")
public void the_system_should_display_detailed_information_including_description_images_price_and_availability_status() {
  
	assertTrue(g.pagenum==3);

	
	
}





//@When("the user enters a search query \\(e.g., {string})")
//public void the_user_enters_a_search_query_e_g(String string) {
    // Write code here that turns the phrase above into concrete actions
   // throw new io.cucumber.java.PendingException();
//}

//@When("clicks on the search button")
//public void clicks_on_the_search_button() {
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
//}

//@Then("the system should display relevant products matching the search query")
//public void the_system_should_display_relevant_products_matching_the_search_query() {
    // Write code here that turns the phrase above into concrete actions
  //  throw new io.cucumber.java.PendingException();
//}

	

}
