package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Janasya {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://janasya.com/?srsltid=AfmBOor1OeYHHAozlvkaIjsPb6bAde6Zp4J9EXaJ3xidY_Xej2InrNZm");
	}
	@Test
	public void Titleverification()
	{
		String ActTitle=driver.getTitle();
		System.out.println(ActTitle);
		String ExptTitle="janasya";
				if(ActTitle.equals(ExptTitle))
				{
				System.out.println("Pass");	
				}
				else
				{
					System.out.println("Fail");	
				}
		
	}
@Test
public void test()
{
	Actions act=new Actions(driver);
	WebElement ele=driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/h1/a/img[2]"));
			act.moveToElement(ele).perform();
			driver.findElement(By.xpath("//*[@id=\"shopify-section-sections--16405611937962__header\"]/height-observer/x-header/nav[1]/ul/li[1]/details/summary"));
		
}

}
