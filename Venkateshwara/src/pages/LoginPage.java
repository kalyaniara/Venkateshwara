package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//div[@role='button' and contains(text(),'Compose')]")
	public WebElement ComMail;
	
	@FindBy(xpath="//div[text()='Recipients']")
	public WebElement Recipnts;
	
	@FindBy(xpath="//input[@aria-label='Subject']")
	public WebElement subjct;
	
	@FindBy(xpath="//div[@aria-label='Message Body']")
	public WebElement MsgBody;
	
	@FindBy(xpath="//div[@role='button' and contains(text(),'Send')]")
	public WebElement MsgSend;
	
	
	
	
	//Methods for operations
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		
		public void composeMail() {
			ComMail.click();
			
		}
		
		public void recipientMail(String a) {
			Recipnts.sendKeys(a);
		}
			
		public void subMail(String b) {
			subjct.sendKeys(b);
		}
		
		public void subMailBody(String c) {
			MsgBody.sendKeys(c);
		}
		
		public void MailSend() {
			MsgSend.click();
		}
		
	
	

}


