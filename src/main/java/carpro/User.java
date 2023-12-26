package carpro;


import java.util.ArrayList;


import java.util.logging.Logger;
public class User {
	private static final Logger logger = Logger.getLogger(User.class.getName());
	public User() {}
	
	private String username ;

 

	
private String password  ;



	private String password1  ;

 
    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String newPassword1) {
        password1 = newPassword1;
    }

	private UserType type;
	 private boolean log = false;

	 
	    public boolean isLog() {
	        return log;
	    }

	    public void setLog(boolean newLog) {
	        log = newLog;
	    }
	 private String address;

	
	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String newAddress) {
	        address = newAddress;
	    }
	 private String email;

	  
	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String newEmail) {
	        email = newEmail;
	    }
	 private String name;

	    
	    public String getName() {
	        return name;
	    }

	    public void setName(String newName) {
	        name = newName;
	    }
	private String id ;

   
    public String getId() {
        return id;
    }

    public void setId(String newId) {
        id = newId;
    }

	private String phone;

   
    public String getPhone() {
        return phone;
    }

    public void setPhone(String newPhone) {
        phone = newPhone;
    }
	 float point=0;
	public User(String username, String password, String email, UserType type) {
		this.username=username;
		this.password=password;
		this.type=type;
		this.email=email;
	}


	
	private static final boolean DEFAULT_TEST_VALUE = false;

	private static ArrayList<User> usercont = new ArrayList<>();
	private boolean test = DEFAULT_TEST_VALUE;

	private boolean isTest() {
	    return test;
	}

	
	private void setTest(boolean test) {
	    this.test = test;
	}

	public boolean login(String userna, String pass, int i) {
	    usercont.add(new User("shahd", "258", "sh@gmail.com", UserType.ADMIN));
	    usercont.add(new User("farah", "3224", "fa@gmail.com", UserType.TENANT));
	    usercont.add(new User("haya", "563", "sh@gmail.com", UserType.TENANT));
	    usercont.add(new User("jaber", "123", "ja@gmail.com", UserType.TENANT));
	    usercont.add(new User("maha", "000", "sshahdyyaseen66@gmail.com", UserType.TENANT));
	    usercont.add(new User("Majd", "m", "ma@gmail.com", UserType.INSTALLER));

	    setTest(check(userna, pass, i));
	    return isTest();
	}

	public boolean check(String username, String password, int i) {
	    logger.info(username);

	    for (User user : usercont) {
	        if (isValidCredentials(user, username, password)) {
	            handleUserLogin(user, i);
	            return true;
	        }
	    }

	    logger.info("Login Unsuccessful, the password or username is incorrect");
	    return false;
	}

	private boolean isValidCredentials(User user, String username, String password) {
	    return user.getUsername().equals(username) && user.getPassword().equals(password);
	}

	private void handleUserLogin(User user, int i) {
	    switch (user.getType()) {
	        case ADMIN:
	            handleAdminLogin(i);
	            break;
	        case INSTALLER:
	            handleInstallerLogin(i);
	            break;
	        case TENANT:
	            handleTenantLogin(user.getUsername(), user.getEmail(), user.getPassword(), i);
	            break;
	    }
	}

	private void handleAdminLogin(int i) {
	    if (i != 1) {
	        new Admin().displayDashboard(usercont);
	    }
	}

	private void handleInstallerLogin(int i) {
	    if (i != 1) {
	        new Installer().installerWork();
	    }
	}

	private void handleTenantLogin(String username, String email, String password, int i) {
	    if (i != 1) {
	        new Tenant(username, email, password).tenantPage();
	    }
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
