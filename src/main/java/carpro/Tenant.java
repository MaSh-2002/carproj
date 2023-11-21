package carpro;



 import java.util.Scanner;
import java.util.logging.Logger;




public class Tenant {
	private static final Logger logger = Logger.getLogger(Tenant.class.getName());
	  static Scanner inputscanner = new Scanner(System.in);
	private String name;
	  private String phoneNumber;
	  private String bankCard;
	  private String email;
	  private String password;
	  static Scanner sc = new Scanner(System.in);
	  public Tenant(String name, String phoneNumber, String bankCard, String email, String password) {
		    this.name = name;
		    this.phoneNumber = phoneNumber;
		    this.bankCard = bankCard;
		    this.email = email;
		    this.password = password;
	  }
	  public Tenant() {
		  name=null;
	  }

	  public void updatePhoneNumber(String newPhoneNumber) {
	    this.phoneNumber = newPhoneNumber;
	  }

	  public void updateBankCard(String newBankCard) {
	    this.bankCard = newBankCard;
	  }

	  public void updateEmail(String newEmail) {
	    this.email = newEmail;
	  }

	  public void updatePassword(String newPassword) {
	    this.password = newPassword;
	  }
	  public String getName() {
		    return name;
		  }

		  public void setName(String name) {
		    this.name = name;
		  }

		  public String getPhoneNumber() {
		    return phoneNumber;
		  }

		  public void setPhoneNumber(String phoneNumber) {
		    this.phoneNumber = phoneNumber;
		  }

		  public String getBankCard() {
		    return bankCard;
		  }

		  public void setBankCard(String bankCard) {
		    this.bankCard = bankCard;
		  }

		  public String getEmail() {
		    return email;
		  }

		  public void setEmail(String email) {
		    this.email = email;
		  }
		  
		  
		  public String getPassword() {
			    return password;
			  }

			  public void setPassword(String password) {
			    this.password = password;
			  }
			  public  String newPhoneNumber;
			  public  String newBankCard;
			  public  String newEmail;
			  public  String newPassword;
			  public   boolean flageUpdatePassword = false;
			  public   boolean flageUpdatePhone = false;
			  public    boolean flageUpdateBank = false;
			  public  boolean flageUpdateEmail  = false;

			  public void viewProfile() {
			    logger.info("Viewing tenant profile...");
			    logger.info(() -> "Name: " + name);
			    logger.info(() -> "Phone Number: " + phoneNumber);
			    logger.info(() -> "Bank Card: " + bankCard);
			    logger.info(() -> "Email: " + email);
			    logger.info(() -> "Password: " + password);
			    logger.info("GOBACK_LABEL");
			    logger.info("2 - Edit Profile Information");
			    int choice = inputscanner.nextInt();

			    switch (choice) {
			      
			      case 1:
			        updateProfileInformation();
			        break;
			      default:
			        logger.info("INVALID_LABEL");
			        break;
			    }
			  }
		  
			  public  int profileChoice;

			  public int updateProfileInformation() {
			    logger.info("---------------------");
			    logger.info("1 - Update phone number");
			    logger.info("2 - Update bank card");
			    logger.info("3 - Update email");
			    logger.info("4 - Update password");

			    profileChoice = inputscanner.nextInt();
			    inputscanner.nextLine(); // Consume newline character

			    switch (profileChoice) {
			      case 1:
			        logger.info("Enter new phone number: ");
			        newPhoneNumber = inputscanner.nextLine();
			        updatePhoneNumber(newPhoneNumber);
			        logger.info("Phone number updated successfully!");
			        flageUpdatePhone = true;
			        break;
			      case 2:
			        logger.info("Enter new bank card: ");
			        newBankCard = inputscanner.nextLine();
			        updateBankCard(newBankCard);
			        logger.info("Bank card updated successfully!");
			        flageUpdateBank = true;
			        break;
			      case 3:
			        logger.info("Enter new email: ");
			        newEmail = inputscanner.nextLine();
			        updateEmail(newEmail);
			        logger.info("Email updated successfully!");
			        flageUpdateEmail = true;
			        break;
			      case 4:
			        logger.info("Enter new password: ");
			        newPassword = inputscanner.nextLine();
			        updatePassword(newPassword);
			        logger.info("Password updated successfully!");
			        flageUpdatePassword = true;
			        break;
			      default:
			        logger.info("INVALID_LABEL");
			        break;
			    }
			    viewProfile();
			    return profileChoice;
		  
		  
			  }
		  
		  
		  
		  
		  
		  
			public void tenantPage() {}


}
