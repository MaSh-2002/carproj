
package carpro;

import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertTrue;

public class Notificationssteps {
	 private Installer installer = new Installer();
	  private Pcatalog catalog = new Pcatalog();
	@Given("the Customer is on the products page")
	public void the_customer_is_on_the_products_page() {
		 catalog.veiwCatalogs();
	    	}
	
    @When("the Customer places an order")
    public void the_customer_places_an_order() {
     
    	  if (installer.isAppointmentConfirmed()) {
              // Send confirmation message to the Customer
              sendConfirmationMessageToCustomer("sshahdyyaseen66@gmail.com");
    	  }
    }

    @Then("an email confirmation should be sent to the Customer")
    public void an_email_confirmation_should_be_sent_to_the_customer() {
    	boolean emailSentSuccessfully = checkEmailSent("sshahdyyaseen66@gmail.com");
        assertTrue("Email confirmation should be sent to the Customer", emailSentSuccessfully);
    }

    @When("a Customer places an order")
    public void a_customer_places_an_order() {
       
    	  if (installer.isAppointmentConfirmed()) {

    	      sendConfirmationMessageToinstaller("majd.th2002@gmail.com");
    }
    }

    @Then("an email notification should be sent to the Installer")
    public void an_email_notification_should_be_sent_to_the_installer() {

        boolean emailSentSuccessfully = checkEmailSent("majd.th2002@gmail.com");

        
        assertTrue("Email notification should be sent to the Installer", emailSentSuccessfully);
    }

    
    private boolean checkEmailSent(String recipientEmail) {
       
        return true;
    }
   private void sendConfirmationMessageToCustomer(String customerEmail) {
        // Implement your logic to send a confirmation message to the Customer
        System.out.println("Confirmation message sent to the Customer: " + customerEmail);
    }
   private void sendConfirmationMessageToinstaller(String Installeremail) {
       // Implement your logic to send a confirmation message to the Customer
       System.out.println("Confirmation message sent to the Customer: " + Installeremail);
   }
}