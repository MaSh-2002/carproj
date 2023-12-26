package carpro;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
    User user = new User();
    boolean check1;
    boolean check2;
    boolean check3;
    boolean check4;
   
    private static final Logger logger = Logger.getLogger(loginsteps.class.getName());
    @Given("the login page is open")
    public void the_login_page_is_open() {
    	 logger.info("Welcome to car Accsessories application");
    }
    @When("I submit user name {string} and password {string} and should enter to admin page")
    public void i_submit_user_name_and_password_and_should_enter_to_admin_page(String username, String password) {
        
        check1 = user.login(username, password,1);
    }
   

    @Then("I should be logged in to admin page")
    public void i_should_be_logged_in_to_admin_page() {
        
    	assertTrue(check1);
    }

    @When("I submit user name {string} and password {string} and should enter to installer page")
    public void i_submit_user_name_and_password_and_should_enter_to_installer_page(String username, String password) {
        check2 = user.login(username, password,1);
    }

    @Then("I should be logged in to installer page")
    public void i_should_be_logged_in_to_installer_page() {
      
            	assertTrue(true);
    }

    @When("I submit user name {string} and password {string} and should enter to tenant page")
    public void i_submit_user_name_and_password_and_should_enter_to_tenant_page(String username, String password) {
        check3 = user.login(username, password,1);
    }

    @Then("I should be logged in to tenant page")
    public void i_should_be_logged_in_to_tenant_page() {
        
    	assertTrue(check3);
    }
    @When("I submit the username <invalid_username> and password <invalid_password>")
    public void i_submit_the_username_invalid_username_and_password_invalid_password(String username,String password) {
    	check4=user.login(username,password,1);
    	
    }
  
}
