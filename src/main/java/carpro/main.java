package carpro;

import java.util.*;


public class main {
 	public static User user = new User();
	public static Scanner input=new Scanner(System.in);

 	
 	
 	
    public static void main(String[] args) {
    	
start();
		


		
		
    }
    
  
    public static void start() {
        System.out.println("Welcome to C A R Z E N :)\n\r");
        System.out.println("You need to:\n\r"
                + "1.Sign in.\n\r"
                + "2.Sign up.\n\r"
        );

        int role = input.nextInt();

        if (role == 1) {
            System.out.println("Enter your name\n\r");
            Scanner i = new Scanner(System.in);
            String name = i.nextLine();

            System.out.println("Enter your password\n\r");
            Scanner iu = new Scanner(System.in);
            String pass = iu.nextLine();

            if (user.login(name, pass,0)) {
                // Successful login, navigate to the main menu
                mainMenu();
            } else {
                System.out.println("Wrong password or username \n\r");
                start();
            }
        } else if (role == 2) {
            // Handle sign-up logic
        } else {
            start();
        }
    }
    public static void mainMenu() {
        System.out.println("Main Menu:\n\r"
                + "1. View your profile\n\r"
                + "2. View catalog\n\r"
                + "3. Exit\n\r"
        );

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                // View profile logic
                break;
            case 2:
                // View catalog logic
                Pcatalog.veiwCatalogs();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please try again.\n\r");
                mainMenu();
                break;
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
}
