package Stoodeo.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Stoodeo.Utility.TestUtil;
import net.bytebuddy.utility.RandomString;

public class Base_Class {

	Stoodeo.config.ReadConfigiration readconfig = new Stoodeo.config.ReadConfigiration();

	public String baseURL = readconfig.getApplicationURL();
	
	public static WebDriver driver;
	public static Logger logger;

	
	@BeforeMethod
	public void initialization() {

		logger = logger.getLogger("Stoodeo_Assignment");
		PropertyConfigurator.configure("log4j.properties");

		
			System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());

			driver = new ChromeDriver();
		

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

		driver.get(baseURL);

	}

	public String getScreenshotAs(String testCaseName) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;

		File source = ts.getScreenshotAs(OutputType.FILE);

		String Random = RandomString.make(5);

		String destination = System.getProperty("user.dir") + "/Screenshot/" + testCaseName + "" + Random + ".png";

		FileUtils.copyFile(source, new File(destination));

		return destination;

	}

	@AfterMethod
	public void tearDown() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();;
	}

	
	
}
