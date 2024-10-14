package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Rediffdropdownvaluepassing {
ChromeDriver driver;
@Before
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	
}
@Test
public void test()
{
	WebElement dayelement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Day')]"));
	Select day=new Select(dayelement);
	day.selectByValue("24");
	WebElement monthelement=driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[22]/td[3]/select[2]"));
	Select month=new Select(monthelement);
	month.selectByVisibleText("SEP");
	WebElement yearelement=driver.findElement(By.xpath("//*[contains(@name,'DOB_Year')]"));
	Select year=new Select(yearelement);
	year.selectByVisibleText("2018");
}
}
