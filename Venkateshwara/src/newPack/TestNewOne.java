package newPack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNewOne {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\kalyaning\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.Amazon.in/");
driver.manage().window().maximize();
driver.findElement(By.xpath("//*[@aria-label='Open Menu']")).click();
driver.manage().timeouts().implicitlyWait(1000, null);
driver.findElement(By.xpath("(//a[text()='Best Sellers'])[2]")).click();
Thread .sleep(1000);
List<WebElement> l=driver.findElements(By.xpath("(//a[text()='Best Sellers'])[2]"));
l.size();
System.out.println("total items are:" +l.size());


	}

}
