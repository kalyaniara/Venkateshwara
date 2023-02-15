package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

import pages.HomePage;
import pages.LoginPage;

public class test1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\kalyaning\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		
		HomePage hp=new HomePage(driver);
		LoginPage lp=new LoginPage(driver);
		hp.fillUsername("arakotakalyani92@gmail.com");
		hp.usernameNxt();
		Thread.sleep(1000);
		hp.fillpwd("Kalyani@1234");
		Thread.sleep(1000);
		hp.checkBoxCh();
		Thread.sleep(1000);
		hp.passwordNxt();
		Thread.sleep(1000);
		//WebDriverWait w=new WebDriverWait(driver, 100);
		//w.untl(ExpectedConditions.elementToBeClickable(lp.compose));
		lp.composeMail();
		Thread.sleep(1000);
		lp.recipientMail("ddinu827@gmail.com");
		Thread.sleep(1000);
		lp.subMail("Regarding upate");
		Thread.sleep(1000);
		lp.subMailBody("Hello don't forget diet");
		Thread.sleep(1000);
		lp.MailSend();
		
}
	
}