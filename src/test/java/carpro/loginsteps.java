package carpro;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
    User user = new User();
    boolean check1;
    boolean check2;
    boolean check3;
    boolean check4;
   

    @Given("the login page is open")
    public void the_login_page_is_open() {
    	 System.out.println("Wlcome to car Accsessories application");
    }
    @When("I submit user name {string} and password {string} and should enter to admin page")
    public void i_submit_user_name_and_password_and_should_enter_to_admin_page(String username, String password) {
        // Implement the logic to submit the username and password and verify entry to the admin pag
        // You can use your existing `User` class to perform the login
        // For example:
        check1 = user.login(username, password);
    }
   

    @Then("I should be logged in to admin page")
    public void i_should_be_logged_in_to_admin_page() {
        // Implement code to verify that the user is logged in as an admin
        // You can use assertions here to check the expected behavior
    	assertTrue(check1);
    }

    @When("I submit user name {string} and password {string} and should enter to installer page")
    public void i_submit_user_name_and_password_and_should_enter_to_installer_page(String username, String password) {
        check2 = user.login(username, password);
    }

    @Then("I should be logged in to installer page")
    public void i_should_be_logged_in_to_installer_page() {
        // Implement code to verify that the user is logged in as an installer
    	assertTrue(check2);
    }

    @When("I submit user name {string} and password {string} and should enter to tenant page")
    public void i_submit_user_name_and_password_and_should_enter_to_tenant_page(String username, String password) {
        check3 = user.login(username, password);
    }

    @Then("I should be logged in to tenant page")
    public void i_should_be_logged_in_to_tenant_page() {
        // Implement code to verify that the user is logged in as a tenant
    	assertTrue(check3);
    }
    @When("I submit the username <invalid_username> and password <invalid_password>")
    public void i_submit_the_username_invalid_username_and_password_invalid_password(String username,String password) {
    	check4=user.login(username,password);
    	
    }
  
}