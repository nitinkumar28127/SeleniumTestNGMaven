package testCases;

import org.testng.annotations.Test;

import pageObjects.LoginPage;

import org.testng.annotations.BeforeTest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	private WebDriver driver;

	@BeforeTest
	public void beforeTest() throws IOException {
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path + "\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		LoginPage login = new LoginPage(driver);
	
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@Test
	public void ValidateUnAuthorizeMessage() {
		driver.get("http://demo.guru99.com/insurance/v1/index.php");
		LoginPage.txtbx_UserName().sendKeys("admin");
		LoginPage.txtbx_Password().sendKeys("admin");
		LoginPage.btn_LogIn().click();
		
	}

}
