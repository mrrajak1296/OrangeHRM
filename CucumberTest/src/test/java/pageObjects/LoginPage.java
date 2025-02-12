package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath = "//input[@placeholder='Username']")
	public WebElement username;
	
	@FindBy(css = "input[placeholder='Password']")
	public WebElement password;
	
	@FindBy(xpath ="//button[normalize-space()='Login']")
	public WebElement loginBtn;
	
	
	
	public void setUsername(String uname) {
		this.username.sendKeys(uname);
	}
	
	
	public void setPassword(String pass) {
		password.sendKeys(pass);
	}
	
	
	public void clickLogin() {
		loginBtn.click();
	}
	
	
	public void login(String uname, String pass){
		setUsername(uname);
		setPassword(pass);
		clickLogin();
		
	}
	
	
	
	
	
	
	
	

}
