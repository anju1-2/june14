package pagepkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Keralapropertyregisterpage {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"listowner\"]")
	WebElement owner;
	@FindBy(xpath="//*[@id=\"utitle\"]")
	WebElement name;
	@FindBy(xpath="//*[@id=\"umail\"]")
	WebElement email;
	@FindBy(xpath="//*[@id=\"memberpass\"]")
	WebElement password;
	@FindBy(xpath="//*[@id=\"repass\"]")
	WebElement confirmpassword;
	@FindBy(xpath="//*[@id=\"umobile\"]")
	WebElement mobile;
	@FindBy(xpath="//*[@id=\"sub_regbutton\"]")
	WebElement createaccountbutton;
	public Keralapropertyregisterpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void dropdownowner()
	{
		Select own=new Select(owner);
		own.selectByVisibleText("builder");
		
	}
	public void SetValues(String namev,String emailv,String passv,String cpassv,String mobilev)
	{
		name.sendKeys(namev);
		email.sendKeys(emailv);
		password.sendKeys(passv);
		confirmpassword.sendKeys(cpassv);
		mobile.sendKeys(mobilev);
	}
	public void createaccountclick()
	{
		createaccountbutton.click();
	}
}
