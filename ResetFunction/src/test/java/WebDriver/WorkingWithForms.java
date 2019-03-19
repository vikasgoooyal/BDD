package WebDriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithForms {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\vikagoya\\Desktop\\Module-3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Users/vikagoya/Desktop/Module-3/WorkingWithForms.html");
		
		
		driver.findElement(By.id("txtUserName")).sendKeys("vikkyg");
		Thread.sleep(10000);
		
		driver.findElement(By.name("txtPwd")).sendKeys("igate");
		Thread.sleep(2000);
		
		
		driver.findElement(By.className("Format")).sendKeys("igate");
		Thread.sleep(10000);
		
		driver.findElement(By.name("txtFN")).sendKeys("vikas");
		Thread.sleep(10000);
		
		driver.findElement(By.name("txtLN")).sendKeys("goyal");
		Thread.sleep(10000);
		
		driver.findElement(By.cssSelector("input[value='Male']")).click();
		Thread.sleep(10000);
		
		driver.findElement(By.name("DtOB")).sendKeys("04/02/1997");
		Thread.sleep(1000);
		
		driver.findElement(By.name("Email")).sendKeys("vikas@gmail.com");
		Thread.sleep(10000);
		
		driver.findElement(By.name("Address")).sendKeys("34a/19p awadhpuri balkeshwar agra");
		Thread.sleep(10000);
		
		Select drpCity = new Select(driver.findElement(By.name("City")));
		
		drpCity.selectByVisibleText("Mumbai1");
		drpCity.selectByIndex(1);
	//drpCity.selectByIndex(2);
		
		
		driver.findElement(By.xpath(".//*[@id='txtPhone']")).sendKeys("9027963675");
	
		driver.findElement(By.cssSelector("input[value='Reading']")).click();
		
		List<WebElement> element = driver.findElements(By.name("chkHobbies"));
		
		Thread.sleep(20000);
		
		driver.findElement(By.name("submit")).click();
			
	}

}
