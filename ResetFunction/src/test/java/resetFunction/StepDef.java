package resetFunction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	WebDriver driver;

	
	@Given("^open the firefox and launch the application$")
	public void open_the_firefox_and_launch_the_application() throws Throwable {
	  
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\vikagoya\\Desktop\\Module-3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Users/vikagoya/Desktop/Module-3/WorkingWithForms.html");
		
	  
	}

	@When("^Enter the username and password$")
	public void enter_the_username_and_password() throws Throwable {
	
		
		
		driver.findElement(By.id("txtUserName")).sendKeys("vikkyg");
		
		
		driver.findElement(By.name("txtPwd")).sendKeys("igate");
		Thread.sleep(10000);
		
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {

		
	driver.findElement(By.name("submit")).click();
		
	    throw new PendingException();
	}

}
