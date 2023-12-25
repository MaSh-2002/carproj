package carpro;


import java.util.ArrayList;


import java.util.logging.Logger;
public class User {
	private static final Logger logger = Logger.getLogger(User.class.getName());
	public User() {}
	
public  String username;
	
	public String password;
	public String password1;
	private UserType type;
	public boolean log;
	public String address;
	public String Email;
	public String name;
	public String id;
	public String phone;
	 float point=0;
	public User(String username, String password, String email, UserType type) {
		this.username=username;
		this.password=password;
		this.type=type;
		this.Email=email;
	}


	
	private static ArrayList<User> usercont= new ArrayList<>();
	public boolean test;
	
	
public boolean login (String userna, String pass,int i) {
	 usercont.add(new User("shahd","258","sh@gmail.com",UserType.ADMIN));
	 usercont.add(new User("farah","3224","fa@gmail.com",UserType.TENANT));
	 usercont.add(new User("haya","563","sh@gmail.com",UserType.TENANT));
	 usercont.add(new User("jaber","123","ja@gmail.com",UserType.TENANT));
	 usercont.add(new User("maha","000","sshahdyyaseen66@gmail.com",UserType.TENANT));
	 usercont.add(new User("Majd","m","ma@gmail.com",UserType.INSTALLER));

	test= check(userna, pass,i);
	return test;
}

	public boolean check(String username, String password, int i) {
		logger.info(username);
		for(User user1: usercont) {
			if (user1.getUsername().equals(username) && user1.getPassword().equals(password)) {
				if(user1.getType().equals(UserType.ADMIN)) {
					Admin admin1= new Admin();
					if(i!=1) admin1.displayDashboard(usercont);////////////////////////////////

					return true;
				}
				else if(user1.getType().equals(UserType.INSTALLER)) {
					
					Installer Ins = new Installer ();
					 if(i!=1) Ins.installerWork();

					return true;
				}
				else if(user1.getType().equals(UserType.TENANT)) {
			Tenant tenant = new Tenant(username,user1.Email,user1.password);
			if(i!=1) tenant.tenantPage();
					return true;
				}
			}
			 
			
		}
		logger.info("Login Unsuccessful, the password or username incorrect");
		return false;
	
	}

public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}
public UserType getType() {
	return type;
}

public void setType(UserType type) {
	this.type = type;
}
}
