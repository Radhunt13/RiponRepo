package JcpennyProductRemoval;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class BaseTest {

	WebDriver driver;

	@Test
	public void f() {
		System.setProperty("webdriver.gecko.driver", "/Users/haquespc/Downloads/geckodriver");
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.jcpenney.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
		
		WebElement element = driver.findElement(By.cssSelector("button[class=\"SecondaryNavigationPanel-shopdepartments\"][data-reactid=\"59\"]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(element).perform();
		
		driver.findElement(By.xpath(".//*[@id='content']/main/header/div[2]/div/div[1]/div[1]/div[1]/div[2]/div/ul/li[7]/button")).click();
		String title=driver.getTitle();
		System.out.println(title);

	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

}
