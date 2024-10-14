package junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rishiherbal {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://rishiherbalindia.linker.store/");
	}
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		String exptitle="Rishiherbal";
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
	public void test()
	{
		List<WebElement> linkslist=driver.findElements(By.tagName("a"));
				int actualLinkCount=linkslist.size();
				System.out.println("Link count:"+actualLinkCount);
				int expLinkCount=30;
				if(actualLinkCount==expLinkCount)
				{
					System.out.println("Link count: passed");
				}
				else
				{
					System.out.println("Link count: failed");
				}
	}
					@Test
					public void textverification()
					{
						String src=driver.getPageSource();
						if(src.contains("check help text"))
						{
							System.out.println("text is present");
						}
							
						else
						{
							System.out.println("not present");
						}
					}			
		
	}

