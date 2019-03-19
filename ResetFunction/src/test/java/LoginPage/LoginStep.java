package LoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LoginPageFactory.LoginPF;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginStep {
	
	private WebDriver driver;
	private LoginPF obj;

	

	
	@Given("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\vikagoya\\Desktop\\Module-3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		obj = new LoginPF(driver);
		driver.get("file:///D:/Users/VIKAGOYA/Desktop/Module-3/login.html");
	}

	@When("^User enter invalid data\\.$")
	public void user_enter_invalid_data() throws Throwable {
		 obj.setPfUser("vikas"); Thread.sleep(1000);
		  obj.setPffPass("vikas"); Thread.sleep(1000);
		  obj.setPfbutton();
		  Thread.sleep(1000);

	}

	@Then("^alert message$")
	public void alert_message() throws Throwable {
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	    System.out.println(alertMessage);
	}

	@When("^User leaves user blank$")
	public void user_leaves_user_blank() throws Throwable {
		 obj.setPfUser(""); Thread.sleep(1000);
		  
		 Thread.sleep(1000);
	}

	@When("^Clicks the button$")
	public void clicks_the_button() throws Throwable {
	  obj.setPfbutton();
	  Thread.sleep(1000);
	}

	@Then("^alert username message$")
	public void alert_username_message() throws Throwable {
	   driver.findElement(By.id("userErrMsg"));
	}

	@When("^User leaves Password blank and clicks the button$")
	public void user_leaves_Password_blank_and_clicks_the_button() throws Throwable {
		 obj.setPfUser("capgemini"); Thread.sleep(1000);
			obj.setPffPass("");
			 obj.setPfbutton();
			 Thread.sleep(1000);
	}

	@Then("^alert password message$")
	public void alert_password_message() throws Throwable {
	   driver.findElement(By.className("errMessage"));
	}

	@When("^User enter all valid data$")
	public void user_enter_all_valid_data() throws Throwable {
		obj.setPfUser("capgemini"); Thread.sleep(1000);
		obj.setPffPass("capg123"); Thread.sleep(1000);
		obj.getPfbutton();
		 Thread.sleep(1000);
	}

	@Then("^navigate to other page\\.$")
	public void navigate_to_other_page() throws Throwable {
		driver.navigate().to("file:///D:/Users/VIKAGOYA/Desktop/Module-3/hotelbooking.html");
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		Thread.sleep(1000);
	}


	
	
	
}
