package Testfunction3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef3 {
	
	WebDriver driver;

	
	@Given("^Open the firefox and lauch the application$")
	public void open_the_firefox_and_lauch_the_application() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\vikagoya\\Desktop\\Module-3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Users/vikagoya/Desktop/Module-3/WorkingWithForms.html");

	}

	@When("^Enter the UserName and Password$")
	public void enter_the_UserName_and_Password(DataTable arg1) throws Throwable {
	   List<List<String>> data = arg1.raw();
	   for(int i=0 ; i<data.size(); i++)
	   {
		   driver.findElement(By.name("txtUName")).clear();
		   driver.findElement(By.name("txtPwd")).clear();
		   driver.findElement(By.name("txtUName")).sendKeys(data.get(i).get(0));
		   driver.findElement(By.name("txtPwd")).sendKeys(data.get(i).get(0));
		   Thread.sleep(7000);
	   }
	}

	@Then("^Reset the Credential$")
	public void reset_the_Credential() throws Throwable {
		driver.findElement(By.name("reset")).click();
	}

}
