package testng;

import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Bff {
	@BeforeTest
	public void beftest()
	{
		reporter=new ExtentSparkReporter("./Reports/myreport1.html");
		reporter.config().setDocumentTitle()
	}

}
