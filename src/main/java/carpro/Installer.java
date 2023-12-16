package carpro;

public class Installer {
public void installerWork() {}
private product selectedProduct;

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
        System.out.println("Installation details provided successfully.");
    } else {
        
        System.out.println("No product selected for installation.");
    }
}


private product getProductByName(String productName) {
   
    for (product product : Pcatalog.getproducts()) {
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


