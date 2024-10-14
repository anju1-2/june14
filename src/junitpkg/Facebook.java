package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
@Test
public void titleverification()
{
	driver.findElement(By.id("email")).sendKeys("zxcv@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("7890");
	driver.findElement(By.name("login")).click();
}
}
