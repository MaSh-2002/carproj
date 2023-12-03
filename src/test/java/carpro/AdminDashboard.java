package carpro;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.*;

public class AdminDashboard {
	
	boolean addedc ,deletedc,addedp,deletedp;
	@Given("that the user is an admin")
	public void that_the_user_is_an_admin() {
	   
		Admin ad = new Admin();
	}

	@When("the admin enter  a catagory with name <{string}> to add it")
	public void the_admin_enter_a_catagory_with_name_to_add_it(String string) {
	  addedc =Pcatalog.addCategory(string);
		
		
	}

	@Then("the catagory  is added")
	public void the_catagory_is_added() {
    	assertTrue(addedc);

	}

	@When("the admin  enter a catagory with id <{int}> delete it")
	public void the_admin_enter_a_catagory_with_id_delete_it(Integer int1) {
	     deletedc = Pcatalog.deletecatalogs(int1);
	}

	@Then("the catagory is deleted")
	public void the_catagory_is_deleted() {
    	assertTrue(deletedc);

	}
	@When("the admin enter  a product with name <{string}> and price<{int}> and catagory number <{int}> to add it")
	public void the_admin_enter_a_product_with_name_and_price_and_catagory_number_to_add_it(String string, Integer int1, Integer int2) {
	    
		  addedp = Pcatalog.addProduct(int1, string, int2);

		
	}

	@Then("the product  is added")
	public void the_product_is_added() {
	
    	assertTrue(addedp);

		
	}

	@When("the admin  enter a product with name <{string}> delete it")
	public void the_admin_enter_a_product_with_name_delete_it(String string) {
	     deletedp = Pcatalog.deleteproduct(string);

	}

	@Then("the product is deleted")
	public void the_product_is_deleted() {
    	assertTrue(deletedp);

	}


}
