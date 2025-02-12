package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LoginPage;

public class LoginSteps {
	WebDriver driver = new ChromeDriver();
	LoginPage loginPage = new LoginPage(driver);
	
	@Given("you are on OrangeHRM page")
	public void you_are_on_orange_hrm_page() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
	}

	@When("you enter username and password")
	public void you_enter_username_and_password() {
		loginPage.login("Admin", "admin123");
		
	}

	@Then("you verigy login success")
	public void you_verigy_login_success() {
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"));
	}

	@When("you enter {string} and {string}")
	public void you_enter_and(String uname, String pass) {
		loginPage.login(uname, pass);
	}




}
