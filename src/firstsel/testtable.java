package firstsel;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class testtable {
	String url="https://www.seleniumeasy.com/test/";
	WebDriver driver;

	@BeforeEach
	public void before() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
	}

	@Test
	void test() {
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[1]/div/div[3]/div[2]/div[2]/div/a[2]")).click();

	}
	@AfterEach
	public void after() {
		System.out.println("nothing");
	}
}
