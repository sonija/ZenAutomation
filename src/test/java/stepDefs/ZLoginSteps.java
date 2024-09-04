package stepDefs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import browserManager.BrowserManager;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import util.ConfigManager;
import driverManager.CreateDriver;
import driverManager.DriverManager;

public class ZLoginSteps {
	
	private WebDriver driver;
    
	public ZLoginSteps() {
		WebDriverManager.chromedriver().setup();
		//driver.manage().window().maximize();
	}
	@Given("the user is on the login page")
	public void loginUrl() {
	    System.out.println("Login Page");
	    driver.get(ConfigManager.getProperty("base_URL"));
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@When("the user enters valid credentials")
	public void enteringCredentials() {
		System.out.println("Test1");
	}

	@Then("the user should be redirected to the homepage")
	public void homePage() {
		System.out.println("Test1");
	}

}
