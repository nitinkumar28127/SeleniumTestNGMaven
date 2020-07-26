package pageObjects;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends PageBase {

	private static Properties properties;

	public LoginPage(WebDriver driver) throws IOException {
		super(driver);
		FileInputStream fs = new FileInputStream(".\\src\\test\\java\\resources\\LoginPageOR.properties");
		properties = new Properties(System.getProperties());
		properties.load(fs);
	}

	private static WebElement element = null;

	public static WebElement txtbx_UserName() {

		System.out.println(properties.getProperty("txtbx_UserName"));
		element = driver.findElement(By.xpath(properties.getProperty("txtbx_UserName")));
		return element;
	}

	public static WebElement txtbx_Password() {

		element = driver.findElement(By.xpath(properties.getProperty("txtbx_Password")));
		return element;
	}

	public static WebElement btn_LogIn() {

		element = driver.findElement(By.xpath(properties.getProperty("btn_LogIn")));
		return element;
	}
}
