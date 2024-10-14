package junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///D:/ANJU%20SOFTWARE%20TESTING/.html");
		
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String alerttext=a.getText();
		System.out.println("alerttext="+alerttext);
		a.accept();
		//a.dismiss();
		driver.findElement(By.xpath("/html/body/iput[2]")).sendKeys("anju");
		driver.findElement(By.xpath("/html/body/iput[3]")).sendKeys("mohanan");
		
	}

}
