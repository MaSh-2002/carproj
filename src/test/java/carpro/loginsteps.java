package carpro;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	User user =new User();
	boolean check1;
	boolean check2;
	boolean check3;
	
	@Given("inter user name and password")
	public void inter_user_name_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Wlcome to car Accsessories application");
	}

	@When("I submit user name <{string}> and password <{string}> and should enter to admin page")
	public void i_submit_user_name_and_password_and_should_enter_to_admin_page(String string, String string2) {
		 check1=user.login(string,string2);
		user.setPassword(string2);
		user.setUsername(string);
		
		
		 
	    	}

	@Then("I should be logged in to admin page for username <{string}> and password <{string}>")
	public void i_should_be_logged_in_to_admin_page_for_username_and_password(String string, String string2) {
	    user.getPassword();
	    user.getUsername();
	    assertTrue(check1);
	}

	@When("I submit user name <{string}> and password <{string}> and should enter to installer page")
	public void i_submit_user_name_and_password_and_should_enter_to_installer_page(String string, String string2) {
		check2=user.login(string,string2);
		user.setPassword(string2);
		user.setUsername(string);
	}

	@Then("I should be logged in to installer page")
	public void i_should_be_logged_in_to_installer_page() {
		user.getPassword();
	    user.getUsername();
	    assertTrue(check2);
	}

	@When("I submit user name <{string}> and password <{string}> and should enter to tenant page")
	public void i_submit_user_name_and_password_and_should_enter_to_tenant_page(String string, String string2) {
		check3=user.login(string,string2);
		user.setPassword(string2);
		user.setUsername(string);
	}

	@Then("I should be logged in to tenant page")
	public void i_should_be_logged_in_to_tenant_page() {
		user.getPassword();
	    user.getUsername();
	    assertTrue(check3);
	}

}
