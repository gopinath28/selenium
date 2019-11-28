package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
static WebDriver driver;
public static void launchBrowser(String url) {
	

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\welcome\\eclipse-workspace\\gopi\\pom\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("url");

}

public static void type(WebElement loc,String in){
	loc.sendKeys(in);

}
public static void click(WebElement loc){
	loc.click();

}
public static void closeBrowser(){
	driver.close();

}

}