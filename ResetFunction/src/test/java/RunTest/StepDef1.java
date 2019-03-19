package RunTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef1 {
	
	WebDriver driver;
	
	@Given("^Open the firefox and lauch the application$")
	public void open_the_firefox_and_lauch_the_application() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "D:\\Users\\vikagoya\\Desktop\\Module-3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Users/vikagoya/Desktop/Module-3/WorkingWithForms.html");
		
	}

	@When("^Enter the UserName\"([^\"]*)\" and Password\"([^\"]*)\"$")
	public void enter_the_UserName_and_Password(String arg1, String arg2) throws Throwable {
	   
		driver.findElement(By.name("txtUName")).sendKeys(arg1);
	
		driver.findElement(By.name("txtPwd")).sendKeys(arg2);
		Thread.sleep(1000);

	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
		driver.findElement(By.name("submit")).click();
		
	}


}
