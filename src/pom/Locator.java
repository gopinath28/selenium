package pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Locator extends BaseClass{
	
public Locator() {
	PageFactory.initElements(driver,this);
}
	@FindBy(id="email")
	private WebElement usertxt;
	public WebElement getUsertxt() {
		return usertxt;
	}
	@FindBy(id="pass")
	private WebElement userpass;
	public WebElement getUserpass() {
		return userpass;
	}
	public WebElement getBtn() {
		return btn;
	}
	@FindBy(id="login")
	private WebElement btn;
	

}


