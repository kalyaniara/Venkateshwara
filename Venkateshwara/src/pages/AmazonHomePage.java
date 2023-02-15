package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomePage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement uid;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement unxt;
	
	@FindBy(name="password")
	public WebElement pwd;
	
	@FindBy(xpath="//input[@name='rememberMe']")
	public WebElement selectCheckbox;
	
	@FindBy(id="signInSubmit")
	public WebElement loginBtn;
	
	public AmazonHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void userId(String a) {
		
		uid.sendKeys(a);
	}
	
	public void userNxt() {
		unxt.click();
		
	}
	
	public void password(String b) {
		pwd.sendKeys(b);
	}
	
	public void checkCheckbox() {
		selectCheckbox.click();
	}
	
	public void lgnBtn() {
		loginBtn.click();
	}
	
	
	
	
	
	
	
	
	

}
