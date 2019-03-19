package ResetFunction4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

	@When("^Enter the username,password,confirm password,firstname,lastname,Gender,Date of birth,Email,Address,City,Phone and Hobies$")
	public void enter_the_username_password_confirm_password_firstname_lastname_Gender_Date_of_birth_Email_Address_City_Phone_and_Hobies() throws Throwable {
	   
		driver.findElement(By.id("txtUserName")).sendKeys("vikkyg");
		Thread.sleep(1000);
		
		driver.findElement(By.name("txtPwd")).sendKeys("igate");
		Thread.sleep(200);
		
		
		driver.findElement(By.className("Format")).sendKeys("igate");
		Thread.sleep(1000);
		
		driver.findElement(By.name("txtFN")).sendKeys("vikas");
		Thread.sleep(100);
		
		driver.findElement(By.name("txtLN")).sendKeys("goyal");
		Thread.sleep(100);
		
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		Thread.sleep(100);
		
		driver.findElement(By.name("DtOB")).sendKeys("04/02/1997");
		Thread.sleep(1000);
		
		driver.findElement(By.name("Email")).sendKeys("vikas@gmail.com");
		Thread.sleep(100);
		
		driver.findElement(By.name("Address")).sendKeys("34a/19p awadhpuri balkeshwar agra");
		Thread.sleep(100);
		
		Select drpCity = new Select(driver.findElement(By.name("City")));
		
		drpCity.selectByVisibleText("Mumbai");
		drpCity.selectByIndex(1);
	//drpCity.selectByIndex(2);
		
		
		driver.findElement(By.xpath(".//*[@id='txtPhone']")).sendKeys("9027963675");
	
		driver.findElement(By.cssSelector("input[value='Reading']")).click();
		
		List<WebElement> element = driver.findElements(By.name("chkHobbies"));
		
		Thread.sleep(20000);
		
	}

	@Then("^Reset the credential$")
	public void reset_the_credential() throws Throwable {
		
		driver.findElement(By.name("submit")).click();
	   
	}


	
	
	
}
