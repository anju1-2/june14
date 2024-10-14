package junitpkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class junitdemo {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
@Test
public void titleverification()
{
	String actualtitle=driver.getTitle();
	String exptitle="google";
	System.out.println("title="+actualtitle);
	if(actualtitle.equals(exptitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
		
	}
}
@Test
public void textverification()
{
	String src=driver.getPageSource();
	if(src.contains("Gmail"))
	{
		System.out.println("text is present");
	}
		
	else
	{
		System.out.println("not present");
	}
}
@After
public void tearDown()
{
	driver.quit();
}
}
