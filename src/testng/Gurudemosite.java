package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Gurudemosite {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	}
@Test
public void test()
{
	
	
	WebElement rightClickButton=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	WebElement editListItem=driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]"));
	WebElement doubleClickButton=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
Actions action=new Actions(driver);
action.contextClick(rightClickButton).perform();
editListItem.click();
Alert a=driver.switchTo().alert();
String alertText1=a.getText();
System.out.println("Right click alert text: " + alertText1);
a.accept();

action.doubleClick(doubleClickButton).perform();

Alert a1=driver.switchTo().alert();
String alertText2=a1.getText();
System.out.println("Right click alert text: " + alertText2);
a1.accept();
}
}
