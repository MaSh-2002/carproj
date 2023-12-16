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
	public String email;
	public String name;
	public String id;
	public String phone;
	 float point=0;
	public User(String username, String password, UserType type) {
		this.username=username;
		this.password=password;
		this.type=type;
	}


	
	private static ArrayList<User> usercont= new ArrayList<>();
	public boolean test;
	
	
public boolean login (String userna, String pass) {
	 usercont.add(new User("shahd","258",UserType.ADMIN));
	 usercont.add(new User("farah","3224",UserType.TENANT));
	 usercont.add(new User("haya","563",UserType.TENANT));
	 usercont.add(new User("jaber","123",UserType.TENANT));
	 usercont.add(new User("maha","000",UserType.TENANT));
	 usercont.add(new User("Majd","2369",UserType.INSTALLER));

	test= check(userna, pass);
	return test;
}

	public boolean check(String username, String password) {
		logger.info(username);
		for(User user1: usercont) {
			if (user1.getUsername().equals(username) && user1.getPassword().equals(password)) {
				if(user1.getType().equals(UserType.ADMIN)) {
					Admin admin1= new Admin();
					admin1.adminWork();////////////////////////////////

					return true;
				}
				else if(user1.getType().equals(UserType.INSTALLER)) {
					
					Installer Ins = new Installer ();
					Ins.installerWork();

					return true;
				}
				else if(user1.getType().equals(UserType.TENANT)) {
			Pcatalog cat=new Pcatalog();
			cat.veiwCatalogs();
					
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
