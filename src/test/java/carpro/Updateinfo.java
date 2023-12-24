package carpro;
import static org.junit.Assert.assertTrue;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Updateinfo {
	Tenant T = new Tenant();
	
	 int updatePhone;
	 int updateBank;
	 int updateEmail;
	 int updatePassword;
	 
	 
@When("I inter <{int}> to update my phone Number")
public void i_inter_to_update_my_phone_number(Integer int1) {
	updatePhone=int1;
}

@Then("my phone number should be updated to <{string}>")
public void my_phone_number_should_be_updated_to(String string) {
T.updatePhoneNumber(string);
	
    assertTrue(updatePhone==1 && T.getPhoneNumber().equals(string));

}

@When("I inter <{int}> to update my bank card number")
public void i_inter_to_update_my_bank_card_number(Integer int1) {
	updateBank=int1;
}

@Then("my bank card number should be updated to <{string}>")
public void my_bank_card_number_should_be_updated_to(String string) {
	T.updateBankCard(string);
	assertTrue(updateBank==2 && T.getBankCard().equals(string));

}

@When("I inter <{int}> to update my email address")
public void i_inter_to_update_my_email_address(Integer int1) {
    updateEmail=int1;
}

@Then("my email address should be updated to <{string}>")
public void my_email_address_should_be_updated_to(String string) {
	T.updateEmail(string);
	assertTrue( updateEmail==3 &&  T.getEmail().equals(string) );
}

@When("I inter <{int}> to update my password")
public void i_inter_to_update_my_password(Integer int1) {
	updatePassword=int1;
}

@Then("my password should be updated to <{string}>")
public void my_password_should_be_updated_to(String string) {
	T.updatePassword(string);
	assertTrue(updatePassword==4 &&  T.getPassword().equals(string)); 
}
}
