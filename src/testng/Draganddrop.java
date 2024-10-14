package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Draganddrop {
	ChromeDriver driver;
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
	}
	@Test
	public void test()
	{
		Actions act=new Actions(driver);
		WebElement source1=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement dest1=driver.findElement(By.xpath("//*[@id=\\\"bank\"]/li"));
		act.dragAndDrop(source1, dest1);
		act.perform();
		WebElement source2=driver.findElement(By.xpath("//*[@id=\\\"fourth\\\"]/a"));
		WebElement dest2=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		act.dragAndDrop(source2, dest2);
		act.perform();
		WebElement source3=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement dest3=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		act.dragAndDrop(source3, dest3);
		act.perform();
		WebElement source4=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement dest4=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		act.dragAndDrop(source4, dest4);
		act.perform();
		
	
	}	

}
