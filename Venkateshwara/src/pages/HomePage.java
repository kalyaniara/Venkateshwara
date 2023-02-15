package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Locators to element
	public WebDriver driver;
	
	@FindBy(xpath="//input[@aria-label='Email or phone']")
	public WebElement uname;
	
	@FindBy(xpath="//span[text()='Next']")
	public WebElement Unxt;
	
	@FindBy(xpath="//input[@aria-label='Enter your password']")
	public WebElement Upwd;
	
    @FindBy(xpath="//input[@type='checkbox']")
	public WebElement checkboxCheck;
    
    @FindBy(xpath="//span[text()='Next']")
	public WebElement pwdNxt;
    
    
    //Methods for operations
    public HomePage(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    		
    }
    
    public void fillUsername(String x)
    {
    	uname.sendKeys(x);
    }
    
    public void usernameNxt() {
    	Unxt.click();
    	
    }
    
    public void fillpwd(String y)
    {
    	Upwd.sendKeys(y);
}
    
    public void checkBoxCh()
    {
    	checkboxCheck.click();
    	
}
    
    public void passwordNxt() {
    	pwdNxt.click();
    }
    
    
}