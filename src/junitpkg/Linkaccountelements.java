package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkaccountelements {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
	}
	@Test
	public void test()
	{
		List<WebElement> linkslist=driver.findElements(By.tagName("a"));
				System.out.println("total count of links="+linkslist.size());
				for(WebElement ele:linkslist)
				{
					String link=ele.getAttribute("href");
					String text=ele.getText();
					System.out.println(link+"----------"+text);
				}
				}
}