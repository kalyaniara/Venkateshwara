package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.AmazonHomePage;
import pages.AmazonLoginPage;

public class AmazonTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
	System.setProperty("webdriver.chrome.driver", "C:\\kalyaning\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26signIn%3D1%26useRedirectOnSuccess%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//driver.manage().window().maximize();
		AmazonHomePage  ahp=new AmazonHomePage(driver);
		AmazonLoginPage alp=new AmazonLoginPage(driver);
		
		ahp.userId("8106537416");
		Thread .sleep(1000);
		ahp.userNxt();
		Thread .sleep(1000);
		ahp.password("8106537416");
		Thread .sleep(1000);
		ahp.checkCheckbox();
		Thread .sleep(1000);
		ahp.lgnBtn();
		Thread .sleep(1000);
		alp.searchitm("baby boy dress 6-12 months");
		Thread .sleep(1000);
		alp.searchi();
		Thread .sleep(1000);
		
		alp.clickSrtBy();
		//alp.SelectSecondOpt();
		alp.clickOnSelectedItem();
	}

}
