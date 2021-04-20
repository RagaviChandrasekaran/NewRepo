package stepdef;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

/*import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.WebDriver;*/
/*
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
*/
public class LoginStepDef {
	WebDriver driver;
	
// Write code here that turns the phrase above into concrete actions
	
	
	
	@Before("@RegressionTest")
	public void setupp() {
		System.out.println("Oracle DB connection");
	}
	@Before(value="@SmokeTest",order=2)	
	public void setup() {
		System.out.println("SQL DB connection");
	}
	@Before(order=1)
	public void setup00() {
		System.out.println("SQL DB connection");
	}
@Given("User is already login page")
public void cre() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	driver.get("https://ui.cogmento.com/");
	System.out.println("New");
	System.out.println("ccccc");

}


/*@When("user enterlogin crede as {String}and {String}")
public void user_is_in_home_page(String uname,String pass) {
driver.findElement(By.name("email")).sendKeys(uname);
driver.findElement(By.name("email")).sendKeys(pass);

}*/
/*
 */ //data table using list
/*@When("user enterlogin crede")
public void enterLogin(DataTable user) {
	List<List<String>> data = user.asLists();
	driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
	driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));

}*/
//Datatable using maps

@When("user enterlogin crede")
public void enterLogin(DataTable user) {
List<Map<String,String>> data=user.asMaps();
	driver.findElement(By.name("email")).sendKeys(data.get(0).get("username"));
	driver.findElement(By.name("password")).sendKeys(data.get(0).get("password"));

}


@Then("Close the browser")
public void close_the_browser() {
    // Write code here that turns the phrase above into concrete actions
    driver.close();
}

}