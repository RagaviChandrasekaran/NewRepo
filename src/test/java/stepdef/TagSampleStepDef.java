package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class TagSampleStepDef {
	WebDriver driver;

	@Given("User login successfully")
	public void user_login_successfully() {
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ui.cogmento.com/");
		
	}

	@Given("User is on deal page")
	public void user_is_on_deal_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

@Given("user logged in successfuly")
public void user_logged_in_successfuly() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Given("user unable to login")
public void user_unable_to_login() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Given("user is on task page")
public void user_is_on_task_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Given("user is on contact page")
public void user_is_on_contact_page() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

@Given("user is on Task edit page")
public void user_is_on_Task_edit_page() {
    // Write codse here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}

}
