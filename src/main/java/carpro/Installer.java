package carpro;


import java.util.Scanner;
import java.util.logging.Logger;

public class Installer {
	private static final Logger logger = Logger.getLogger(Installer.class.getName());	

	boolean isLoggedIn = true;

public void installerWork() {
	
	Scanner in = new Scanner(System.in);
	while (isLoggedIn) {
		logger.info("Welcome to Installer Dashboard Panel");
		logger.info("1 - Show schedule appointments");
	

		int choice = in.nextInt();

		if (choice == 1) {
		    for (Order order : Pcatalog.getOrders()) {
		        logger.info("test");
		        order.toString();
		    }
		} else {
		    logger.info("Invalid choice");
		    installerWork();
		}		
}


	
}
private Product selectedProduct;

private boolean installationRequestConfirmed = false;
private boolean informationProvidedAboutScheduledInstallation = false;
private boolean appointmentConfirmed = false;
private boolean relevantDetailsProvided = false;

public void selectProductForInstallation(String productName) {
 
    selectedProduct = getProductByName(productName);
}

public void provideInstallationDetails(String carMakeModel, String preferredDate) {
   
    InstallationDetails installationDetails = new InstallationDetails(carMakeModel, preferredDate);

   
    if (selectedProduct != null) {
       
        selectedProduct.setInstallationDetails(installationDetails);
        logger.info("Installation details provided successfully.");
    } else {
        
    	logger.info("No product selected for installation.");
    }
}


private Product getProductByName(String productName) {
   
    for (Product product : Pcatalog.getProducts1()) {
        if (product.name.equalsIgnoreCase(productName)) {
            return product;
        }
    }
    return null; 
}

public boolean isInstallationRequestConfirmed() {
    return installationRequestConfirmed;
}

public boolean isInformationProvidedAboutScheduledInstallation() {
    return informationProvidedAboutScheduledInstallation;
}

public void confirmInstallationRequest() {
 
    installationRequestConfirmed = true;
}

public void provideInformationAboutScheduledInstallation() {
  
    informationProvidedAboutScheduledInstallation = true;
}

public void confirmAppointment() {
   
    appointmentConfirmed = true;
}

public boolean isAppointmentConfirmed() {
    return appointmentConfirmed;
}

public boolean areRelevantDetailsProvided() {
    return relevantDetailsProvided;
}

public void provideRelevantDetails() {
 
    relevantDetailsProvided = true;
}
}


