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
	  }
	  public Tenant(String name , String email, String password) {
		  this.name=name;
		  this.email = email;
		  this.password = password;
		  
		  
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
			  private  String newPhoneNumber;
			  private   String newBankCard;
			  private   String newEmail;
			  private   String newPassword;
			
			
		
			  public  boolean flageUpdateEmail  = false;
			  public  boolean flageUpdateBank  = false;
			  public  boolean flageUpdatePhone = false;
			  public  boolean flageUpdatePassword  = false;
			  public void setnewPhoneNumber(String newPhoneNumber ) {
				    this.newPhoneNumber  = newPhoneNumber ;
				  }

				  public String getnewPhoneNumber() {
				    return newPhoneNumber;
				  }
				  public void setnewBankCard(String newBankCard) {
					    this.newBankCard  = newBankCard ;
					  }

					  public String getnewBankCard() {
					    return newBankCard;
					  }
					  
					  public void setnewEmail(String newEmail) {
						    this.newEmail  = newEmail;
						  }

						  public String getnewEmail() {
						    return newEmail;
						  }
						  public void setnewPassword(String newPassword) {
							    this.newPassword =newPassword;
							  }

							  public String getnewPassword() {
							    return newPassword;
							  }
			  public void viewProfile() {
			
				    logger.info("Viewing customer profile...");
				    logger.info(() -> "Name: " + name);
				    logger.info(() -> "Phone Number: " + phoneNumber);
				    logger.info(() -> "Bank Card: " + bankCard);
				    logger.info(() -> "Email: " + email);
				    logger.info(() -> "Password: " + password);
				    logger.info("GOBACK_LABEL");
				    logger.info("1 - Edit Profile Information");
				    logger.info("2 - Back to Main Menu");

				    int choice = inputscanner.nextInt();
				    inputscanner.nextLine();

				    switch (choice) {
				        case 1:
				            updateProfileInformation();
				            break;
				        case 2:
				         
				            tenantPage();
				            break;
				        default:
				            logger.info("INVALID_LABEL");
				            break;
				    }
				}
				public int updateProfileInformation() {
					  int profileChoice = 0;
				    logger.info("---------------------");
				    logger.info("1 - Update phone number");
				    logger.info("2 - Update bank card");
				    logger.info("3 - Update email");
				    logger.info("4 - Update password");
				    logger.info("5 - Back to Profile Menu");

				    profileChoice = inputscanner.nextInt();
				    inputscanner.nextLine(); 

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
				        case 5:
				           
				            break;
				        default:
				            logger.info("INVALID_LABEL");
				            break;
				    }
				    viewProfile();
				    return profileChoice;
				}

				public void tenantPage() {
				    logger.info("W E L C O M E \n\r");
				  logger.info("1. veiw your profile \n2. veiw catalog \n\r");
				    Scanner x = new Scanner(System.in);
				    int shoose = x.nextInt();
				    if (shoose == 1) {

				        viewProfile();

				    } else if (shoose == 2) {

				        Pcatalog cat = new Pcatalog();
				        cat.veiwCatalogs();
				    }
				}
				
}