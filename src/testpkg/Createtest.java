package testpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagepkg.Createpage;
import pagepkg.Fbloginpage;

public class Createtest {
	WebDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
@Test
public void test()
{
	Fbloginpage login=new Fbloginpage(driver);
	login.setValues("anjummmm@gmail.com", "gfhjklj");
	login.loginclick();

}
@Test
public void Createpagetest()
{
	Createpage cpage=new Createpage(driver);
	cpage.CreatePageClick();
	cpage.textVerification();
	
	
}
}
