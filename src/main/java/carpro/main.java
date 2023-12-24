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
		int role=input.nextInt();
		if(role==1)
		{
			System.out.println("enter your name\n\r");

			Scanner i=new Scanner(System.in);
			String name= i.nextLine();
			
			System.out.println("enter your password\n\r");
		 Scanner iu=new Scanner(System.in);

			String pass= iu.nextLine();
			
			
			
 if(user.login(name, pass)==false) {
		System.out.println("worng password or username \n\r");
		start();
 }
	
 
		}
		else if(role==2) {
			
			
		}
		
		else start();

		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
