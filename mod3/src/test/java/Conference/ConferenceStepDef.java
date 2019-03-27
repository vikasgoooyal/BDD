package Conference;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageBeanConferencebooking.ConferencePageFactory;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConferenceStepDef {
	private WebDriver driver;
	private ConferencePageFactory obj;



@Given("^User is on conference booking page$")
public void user_is_on_conference_booking_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\vikagoya\\Desktop\\Module-3\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	obj = new ConferencePageFactory(driver);
	driver.get("file:///D:/Users/VIKAGOYA/Desktop/ConferenceRegistartion.html");
}

@Then("^check the title of the page$")
public void check_the_title_of_the_page() throws Throwable {
	String title=driver.getTitle();
	if(title.contentEquals("Conference Registartion")) System.out.println("****** Title Matched");
	else System.out.println("****** Title NOT Matched");
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	driver.close();
}

@When("^user leaves first Name blank$")
public void user_leaves_first_Name_blank() throws Throwable {
	 obj.setpFname("");
	    Thread.sleep(50);
}

@When("^clicks the button$")
public void clicks_the_button() throws Throwable {
	 obj.setpNext();
	    Thread.sleep(50);}

@Then("^display alert msg$")
public void display_alert_msg() throws Throwable {
	  
		String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(50);
		driver.switchTo().alert().accept();
	    System.out.println("******" + alertMessage);
}

@When("^user leaves last Name blank and clicks the button$")
public void user_leaves_last_Name_blank_and_clicks_the_button() throws Throwable {
	   obj.setpFname("vikas");
	   Thread.sleep(50);
	   obj.setpLname("");
	   Thread.sleep(50);
	   obj.setpNext();
	   
}

@When("^user enters incorrect email format and clicks the button$")
public void user_enters_incorrect_email_format_and_clicks_the_button() throws Throwable {
	 obj.setpFname("vikas");
	   Thread.sleep(50);
	   obj.setpLname("goyal");
	   Thread.sleep(50);
	 obj.setpEmail("raam.com");
	 obj.setpNext();
}

@When("^user leaves contactNo blank and clicks the button$")
public void user_leaves_contactNo_blank_and_clicks_the_button() throws Throwable {
	 obj.setpFname("vikas");
	   Thread.sleep(50);
	   obj.setpLname("goyal");
	   Thread.sleep(50);
	   obj.setpEmail("raamu@gmail.com");
	   Thread.sleep(50);
	   obj.setpPhone("");
	   Thread.sleep(50);
	   obj.setpNext();
}

@When("^user enters incorrect mobileNo format and clicks the button$")
public void user_enters_incorrect_mobileNo_format_and_clicks_the_button() throws Throwable {
		obj.setpFname("vikas");
	   Thread.sleep(50);
	   obj.setpLname("goyal");
	   Thread.sleep(50);
	   obj.setpEmail("raamu@gmail.com");
	   Thread.sleep(50);
	   obj.setpPhone("123");
	   Thread.sleep(50);
	   obj.setpNext();
}

@When("^user doesnot select NoOfPeople$")
public void user_doesnot_select_NoOfPeople() throws Throwable {
	obj.setpFname("vikas");
	   Thread.sleep(50);
	   obj.setpLname("goyal");
	   Thread.sleep(50);
	   obj.setpEmail("raamu@gmail.com");
	   Thread.sleep(50);
	   obj.setpPhone("9027963675");
	   Thread.sleep(50);
	   obj.setpNext();

}

@When("^user leaves Building and room no blank and clicks the button$")
public void user_leaves_Building_and_room_no_blank_and_clicks_the_button() throws Throwable {
   
	obj.setpFname("vikas");
	   Thread.sleep(50);
	   obj.setpLname("goyal");
	   Thread.sleep(50);
	   obj.setpEmail("raamu@gmail.com");
	   Thread.sleep(50);
	   obj.setpPhone("9027963675");
	   Thread.sleep(50);
	   obj.setpSize("2");
	   Thread.sleep(50);
	   obj.setpAdd("");
	   Thread.sleep(50);
	   obj.setpNext();
	 

}

@When("^user leaves area name blank and clicks the button$")
public void user_leaves_area_name_blank_and_clicks_the_button() throws Throwable {
	obj.setpFname("vikas");
	   Thread.sleep(50);
	   obj.setpLname("goyal");
	   Thread.sleep(50);
	   obj.setpEmail("raamu@gmail.com");
	   Thread.sleep(50);
	   obj.setpPhone("9027963675");
	   Thread.sleep(50);
	   obj.setpSize("2");
	   Thread.sleep(50);
	   obj.setpAdd("talwade,pune");
	   Thread.sleep(50);
	   obj.setpAdd2("");
	   Thread.sleep(50);
	   obj.setpNext();
}

@When("^user doesnot select city$")
public void user_doesnot_select_city() throws Throwable {
	obj.setpFname("vikas");
	   Thread.sleep(50);
	   obj.setpLname("goyal");
	   Thread.sleep(50);
	   obj.setpEmail("raamu@gmail.com");
	   Thread.sleep(50);
	   obj.setpPhone("9027963675");
	   Thread.sleep(50);
	   obj.setpSize("2");
	   Thread.sleep(50);
	   obj.setpAdd("talwade,pune");
	   Thread.sleep(50);
	   obj.setpAdd2("Maharatra");
	   Thread.sleep(50);
	   Thread.sleep(50);
	   obj.setpNext();
}

@When("^user doesnot select state$")
public void user_doesnot_select_state() throws Throwable {
		obj.setpFname("vikas");
	   Thread.sleep(50);
	   obj.setpLname("goyal");
	   Thread.sleep(50);
	   obj.setpEmail("raamu@gmail.com");
	   Thread.sleep(50);
	   obj.setpPhone("9027963675");
	   Thread.sleep(50);
	   obj.setpSize("2");
	   Thread.sleep(50);
	   obj.setpAdd("talwade,pune");
	   Thread.sleep(50);
	   obj.setpAdd2("maharatra");
	   Thread.sleep(50);
	   obj.setpCity("Pune");
	   Thread.sleep(50);
	   obj.setpNext();
}

@When("^user doesnot select membership type\\.$")
public void user_doesnot_select_membership_type() throws Throwable {
	obj.setpFname("vikas");
	   Thread.sleep(50);
	   obj.setpLname("goyal");
	   Thread.sleep(50);
	   obj.setpEmail("raamu@gmail.com");
	   Thread.sleep(50);
	   obj.setpPhone("9027963675");
	   Thread.sleep(50);
	   obj.setpSize("2");
	   Thread.sleep(50);
	   obj.setpAdd("talwade,pune");
	   Thread.sleep(50);
	   obj.setpAdd2("maharatra");
	   Thread.sleep(50);
	   obj.setpCity("Pune");
	   Thread.sleep(50);
	   obj.setpState("Tamilnadu");
	   obj.setpNext();
}

@When("^user enters all valid data$")
public void user_enters_all_valid_data() throws Throwable {
   
	obj.setpFname("vikas");
	   Thread.sleep(50);
	   obj.setpLname("goyal");
	   Thread.sleep(50);
	   obj.setpEmail("raamu@gmail.com");
	   Thread.sleep(50);
	   obj.setpPhone("9027963675");
	   Thread.sleep(50);
	   obj.setpSize("2");
	   Thread.sleep(50);
	   obj.setpAdd("talwade,pune");
	   Thread.sleep(50);
	   obj.setpAdd2("maharatra");
	   Thread.sleep(50);
	   obj.setpCity("Pune");
	   Thread.sleep(50);
	   obj.setpState("Tamilnadu");
	   Thread.sleep(50);
	   obj.setpStatus();
	   obj.setpNext();
	   String alertMessage = driver.switchTo().alert().getText();
		Thread.sleep(50);
		driver.switchTo().alert().accept();
	    System.out.println("******" + alertMessage);
	   
}

@Then("^navigate to payment page$")
public void navigate_to_payment_page() throws Throwable {
	driver.navigate().to("file:///D:/Users/VIKAGOYA/Desktop/PaymentDetails.html");
	driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
	Thread.sleep(50);
}

@Given("^User is on personal detail page$")
public void user_is_on_personal_detail_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "D:\\Users\\vikagoya\\Desktop\\Module-3\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	obj = new ConferencePageFactory(driver);
	driver.get("file:///D:/Users/VIKAGOYA/Desktop/PaymentDetails.html");
}

@When("^user leaves CardHolderName blank and clicks the button$")
public void user_leaves_CardHolderName_blank_and_clicks_the_button() throws Throwable {
	obj.setPcardName("");
	obj.setPbutton();
}

@When("^user leaves DebitcardNumber blank and clicks the button$")
public void user_leaves_DebitcardNumber_blank_and_clicks_the_button() throws Throwable {
	obj.setPcardName("vikas");
	Thread.sleep(50);
	obj.setpDebitCard("");
	obj.setPbutton();
}

@When("^user leaves ExpirationMonth blank and clicks the button$")
public void user_leaves_ExpirationMonth_blank_and_clicks_the_button() throws Throwable {
	obj.setPcardName("vikas");
	Thread.sleep(50);
	obj.setpDebitCard("7852415455");
	Thread.sleep(50);
	obj.setpMon("");
	Thread.sleep(50);
	obj.setPbutton();
}

@When("^user leaves ExpirationYear blank and clicks the button$")
public void user_leaves_ExpirationYear_blank_and_clicks_the_button() throws Throwable {
	obj.setPcardName("vikas");
	Thread.sleep(50);
	obj.setpDebitCard("7878995521");
	Thread.sleep(50);
	obj.setPcvv("298");
	obj.setpMon("12");
	Thread.sleep(50);
	obj.setpYear("");
	Thread.sleep(50);
	obj.setPbutton();
}

@When("^User enter all persona; detail correct$")
public void user_enter_all_persona_detail_correct() throws Throwable {
	obj.setPcardName("vikas");
	Thread.sleep(50);
	obj.setpDebitCard("12456852555");
	Thread.sleep(50);
	obj.setPcvv("298");
	obj.setpMon("12");
	Thread.sleep(50);
	obj.setpYear("2014");
	Thread.sleep(50);
	obj.setPbutton();
	
}


	
	
}
