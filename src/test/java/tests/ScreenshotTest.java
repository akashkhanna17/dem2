package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import utilities.ScreenshotUtil;

import org.testng.ITestResult;
import org.testng.annotations.*;		

public class ScreenshotTest {
   WebDriver driver;
   
   @BeforeMethod
   public void setUp() {
	   driver=new ChromeDriver();
   }
   
   @Test
   public void failTest() {
	   driver.get("https://www.google.com");
	   throw new RuntimeException("INtentional failure to capture screenshot");
   }
   
   @AfterMethod
   public void tearDown(ITestResult result) {
	   if(result.getStatus()==ITestResult.FAILURE) {
		   ScreenshotUtil.captureScreenshot(driver, result.getMethod().getMethodName());
	   }
	   if(driver!=null) {
		   driver.quit();
	   }
   }
}
