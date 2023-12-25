package carpro;

import static org.junit.Assert.assertTrue;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Installationsteps {
    private Pcatalog catalog = new Pcatalog();
    private Installer installer = new Installer();

    @Given("the user in  the product details page")
    public void the_user_in_the_product_details_page() {
    	System.out.println("User is on the product details page.");
       
    }
    @When("the user selects a specific product {string} for installation")
    public void the_user_selects_a_specific_product_for_installation(String productName) {
        installer.selectProductForInstallation(productName);
        System.out.println("User selects product for installation: " + productName);
      
    }
    @When("the user provides installation details for example {string} and {string}")
    public void whenUserProvidesInstallationDetails(String carMakeModel, String preferredDate) {
        installer.provideInstallationDetails(carMakeModel, preferredDate);
        System.out.println("User provides installation details: " + carMakeModel + ", " + preferredDate);
    }
    
    @Then("the system should confirm the request and provide information about the scheduled installation")
    public void thenSystemShouldConfirmRequestAndProvideInformation() {
        installer.confirmInstallationRequest();
        installer.provideInformationAboutScheduledInstallation();
        assertTrue(installer.isInstallationRequestConfirmed());
        assertTrue(installer.isInformationProvidedAboutScheduledInstallation());
    }

    @Given("the user is on the installation services page")
    public void givenUserIsOnInstallationServicesPage() {
        System.out.println("User is on the installation services page.");
    }

    
    @When("the user selects a product for installation")
    public void whenUserSelectsProductForInstallation() {
        catalog.veiwCatalogs();
        System.out.println("User selects a product for installation.");
    }

    @Then("the system should display available installation dates and times")
    public void thenSystemShouldDisplayAvailableDatesAndTimes() {
        System.out.println("System displays available installation dates and times.");
    }

    @When("the user chooses an available date and time")
    public void whenUserChoosesAvailableDateAndTime() {
        System.out.println("User chooses an available date and time.");
    }

    @Then("the system should confirm the appointment and provide relevant details")
    public void thenSystemShouldConfirmAppointmentAndProvideDetails() {
        installer.confirmAppointment();
        assertTrue(installer.isAppointmentConfirmed());
        assertTrue(installer.areRelevantDetailsProvided());
    }
}
