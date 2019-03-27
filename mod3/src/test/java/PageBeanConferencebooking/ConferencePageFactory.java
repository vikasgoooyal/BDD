package PageBeanConferencebooking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ConferencePageFactory {
	
	WebDriver driver;
	
	@FindBy(id="txtFirstName")
	@CacheLookup
	WebElement pFname;
	
	@FindBy(id="txtLastName")
	@CacheLookup
	WebElement pLname;
	
	@FindBy(name="Email")	
	@CacheLookup
	WebElement pEmail;
	
	@FindBy(css="input[pattern='[789][0-9]{9}']")
	@CacheLookup
	WebElement pPhone;

	@FindBy(name="size")
	@CacheLookup
	WebElement pSize;
	

	@FindBy(name="Address")
	@CacheLookup
	WebElement pAdd;
	
	
	@FindBy(name="Address2")
	@CacheLookup
	WebElement pAdd2;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement pCity;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement pState;
	
	@FindBy(name="memberStatus")
	@CacheLookup
	WebElement pStatus;
	
	@FindBy(linkText="Next")
	@CacheLookup
	WebElement pNext;
	
	@FindBy(id="txtCardholderName")
	@CacheLookup
	WebElement pcardName;
	
	@FindBy(id="txtDebit")
	@CacheLookup
	WebElement pDebitCard;
	
	
	@FindBy(id="txtCvv")
	@CacheLookup
	WebElement pcvv;
	
	@FindBy(id="txtMonth")
	@CacheLookup
	WebElement pMon;

	@FindBy(id="txtYear")
	@CacheLookup
	WebElement pYear;
	
	@FindBy(id="btnPayment")
	@CacheLookup
	WebElement pbutton;

	
	public WebElement getPbutton() {
		return pbutton;
	}

	public void setPbutton() {
		pbutton.click();
	}

	public WebElement getPcardName() {
		return pcardName;
	}

	public void setPcardName(String scardName) {
		pcardName.sendKeys(scardName);
	}

	public WebElement getpDebitCard() {
		return pDebitCard;
	}

	public void setpDebitCard(String sDebitCard) {
		pDebitCard.sendKeys(sDebitCard);
	}

	public WebElement getPcvv() {
		return pcvv;
	}

	public void setPcvv(String scvv) {
		pcvv.sendKeys(scvv);
	}

	public WebElement getpMon() {
		return pMon;
	}

	public void setpMon(String cMon) {
		pMon.sendKeys(cMon);
	}

	public WebElement getpYear() {
		return pYear;
	}

	public void setpYear(String sYear) {
		pYear.sendKeys(sYear);
	}

	public ConferencePageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getpFname() {
		return pFname;
	}

	public void setpFname(String sFname) {
		pFname.sendKeys(sFname);
	}

	public WebElement getpLname() {
		return pLname;
	}

	public void setpLname(String sLname) {
		pLname.sendKeys(sLname);
	}

	public WebElement getpEmail() {
		return pEmail;
	}

	public void setpEmail(String sEmail) {
		pEmail.sendKeys(sEmail);
	}

	public WebElement getpPhone() {
		return pPhone;
	}

	public void setpPhone(String sPhone) {
		pPhone.sendKeys(sPhone);
	}

	public WebElement getpSize() {
		return pSize;
	}

	public void setpSize(String sSize) {
		Select drpCity = new Select(pSize);
		drpCity.selectByVisibleText(sSize);
	}

	public WebElement getpAdd() {
		return pAdd;
	}

	public void setpAdd(String sAdd) {
		pAdd.sendKeys(sAdd);
	}

	public WebElement getpAdd2() {
		return pAdd2;
	}

	public void setpAdd2(String sAdd2) {
		pAdd2.sendKeys(sAdd2);
	}

	public WebElement getpCity() {
		return pCity;
	}

	public void setpCity(String sCity) {
		Select drpCity = new Select(pCity);
		drpCity.selectByVisibleText(sCity);
	}

	public WebElement getpState() {
		return pState;
	}

	public void setpState(String sState) {
		Select drpCity = new Select(pState);
		drpCity.selectByVisibleText(sState);
	}

	public WebElement getpStatus() {
		return pStatus;
	}

	public void setpStatus() {
		pStatus.click();
	}

	public WebElement getpNext() {
		return pNext;
	}

	public void setpNext() {
		pNext.click();
	}

	
	
	
	
	

}
