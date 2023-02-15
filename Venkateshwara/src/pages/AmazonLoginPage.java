package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;

public class AmazonLoginPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']")
	public WebElement SearchItems;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement Search;
	
	@FindBy(xpath="//span[@aria-label='Sort by:']")
	public WebElement ClickOnSortBy;
	
	@FindBy(xpath="//div[@class='a-popover-wrapper']")
	public WebElement SlctSecOpt;
	
	@FindBy(xpath="//a[text()='Price: High to Low']")
	public WebElement selectPrice;
	
	
	
	
	
	//Select s=new Select(selectPrice);
	
	
	//span[@class='a-button-inner']/child::i[@class='a-icon a-icon-dropdown']
	
	
	
	
	public AmazonLoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);	
	}
	
	public void searchitm(String x) {
		
		SearchItems.sendKeys(x);
	}
public void searchi() {
		
	Search.click();
	
}

public void clickSrtBy() {
	
	ClickOnSortBy.click();
}
public void clickOnSelectedItem()
{
	selectPrice.click(); 
	

}
/*public void SelectSecondOpt() {
	Select s=new Select(SlctSecOpt);
	s.selectByIndex(1);*/
	
}





