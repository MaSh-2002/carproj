package carpro;

import java.util.*;
import java.util.logging.Logger;

public class Main {
    public static final  User user = new User();
    public static final  Scanner input = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        logger.info("Welcome to C A R Z E N :)\n\r");
        logger.info("You need to:\n\r"
                + "1. Sign in.\n\r"
                + "2. Sign up.\n\r");

        int role = input.nextInt();

        if (role == 1) {
            logger.info("Enter your name\n\r");
            Scanner i = new Scanner(System.in);
            String name = i.nextLine();

            logger.info("Enter your password\n\r");
            Scanner iu = new Scanner(System.in);
            String pass = iu.nextLine();

            if (user.login(name, pass, 0)) {
                mainMenu();
            } else {
                logger.info("Wrong password or username \n\r");
                start();
            }
        } else {
            // Code for other roles
            start();
        }
    }

    public static void mainMenu() {
        logger.info("Main Menu:\n\r"
                + "1. View your profile\n\r"
                + "2. View catalog\n\r"
                + "3. Exit\n\r");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                // Code for case 1
                break;
            case 2:
                Pcatalog.veiwCatalogs();
                break;
            case 3:
                System.exit(0);
                break;
            default:
                logger.info("Invalid choice. Please try again.\n\r");
                mainMenu();
                break;
        }
    }
}