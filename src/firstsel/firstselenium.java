package firstsel;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



class firstselenium {
	WebDriver driver;

	@BeforeMethod
	public void beforemethod() {

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://phptravels.com/");



	}
	@Test
	public void test() {
		String element=driver.getTitle();
		System.out.println(element);
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		driver.switchTo().alert().accept();
		wait.until(ExpectedConditions.elementToBeClickable(By.className("className")));
		
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[@class='cd-words-wrapper']"))).click().build().perform();
		
		//File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.File);
		//FileUtils.copyFile(file, "C:\\");
		
		
		
	}
}


