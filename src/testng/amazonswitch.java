package testng;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazonswitch {
	ChromeDriver d;

	
	@BeforeTest
	public void load()
	{
		d=new ChromeDriver();
		d.get("https://amazon.in");
		d.manage().window().maximize();
	}
@Test
public void test()
{
	
	d.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobilephones",Keys.ENTER);
	String actualtitle=d.getTitle();
	String exptitle="Amazon.in:mobilephones";
	System.out.println("title="+actualtitle);
	if(actualtitle.equals(exptitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
		
	}
	String parentWindow=d.getWindowHandle();//currentwindow
	d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div)
	Set<String> allWindow = d.getWindowHandles();
	for (String handle : allWindow) {
		if (!handle.equalsIgnoreCase(parentWindow)) {
			d.switchTo().window(handle);
			System.out.println(d.getTitle());
			JavascriptExecutor js = (JavascriptExecutor) d;
			js.executeScript("window.scrollBy(0,500)");
			
			d.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("anbc@gmail.com");
			//d.close();
		
}
}
