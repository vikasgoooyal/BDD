package LoginPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPF {
	WebDriver driver;
	
	@FindBy(name="userName")
	@CacheLookup
	WebElement pfUser;
	
	
	
	@FindBy(name = "userPwd")
	@CacheLookup
	WebElement pffPass;
	
	
	@FindBy(how=How.CLASS_NAME, using = "btn")
	@CacheLookup
	WebElement pfbutton;

	public LoginPF(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getPfUser() {
		return pfUser;
	}

	public void setPfUser(String sfUser) {
		pfUser.sendKeys(sfUser);
	}

	public WebElement getPfbutton() {
		return pfbutton;
	}

	public void setPfbutton() {
		pfbutton.click();
	}

	public WebElement getPffPass() {
		return pffPass;
	}

	public void setPffPass(String sffPass) {
		pffPass.sendKeys(sffPass);
		
	}
	
	
	
	
	

}
