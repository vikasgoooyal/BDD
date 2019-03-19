package AlertDemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo1 {

public static void main(String[] args) throws InterruptedException  {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\vikagoya\\Desktop\\Module-3\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///D:/Users/vikagoya/Desktop/Module-3/AlertBoxDemos.html");
		
		//Thread.sleep(5000);
		
		Alert alert=driver.switchTo().alert();
		driver.findElement(By.id("alert")).click();
		System.out.println("The alert message is: "+alert.getText());
	    alert.accept();
		
	//	Thread.sleep(500);
		
		driver.findElement(By.id("confirm")).click();
		
		//Thread.sleep(500);
		
		Alert confirm = driver.switchTo().alert();
		confirm.accept();
		Thread.sleep(5000);
		driver.findElement(By.id("prompt")).click();
		Alert prompt = driver.switchTo().alert();
		String text = prompt.getText();
		prompt.sendKeys("vikas");
		Thread.sleep(5000);
		prompt.accept();
		Thread.sleep(5000);
		
		
		driver.findElement(By.id("prompt")).click();
		prompt = driver.switchTo().alert();
		prompt.dismiss();
		
		driver.quit();			

}
}