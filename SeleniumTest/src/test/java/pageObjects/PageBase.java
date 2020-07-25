package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageBase {
	public static WebDriver driver;
	public static boolean bResult;
	
	public  PageBase(WebDriver driver){
		PageBase.driver = driver;
		
}
}
