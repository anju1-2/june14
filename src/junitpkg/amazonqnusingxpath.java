package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazonqnusingxpath {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://amazon.in");
	}
@Test
public void test()
{
	
	driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	driver.navigate().back();
	driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
	driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
}
}


