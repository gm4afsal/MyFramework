package com.qualityworkscg.base;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import com.qualityworkscg.common.newControlCenter;



import io.github.bonigarcia.wdm.WebDriverManager;

public class  newBase extends newControlCenter
{  
 @Override
 @Parameters({"baseUrl"})
  
  @BeforeMethod
  public void onTestSetUp(String baseUrl) throws IOException, InterruptedException
  {
	 System.out.println("Setting desired capabilites."); 
	 super.onTestSetUp(baseUrl);
	  
	  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
      driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
      driver.manage().window().maximize();
  }
  
 @AfterMethod
 public void timeCalculator()
 {
	 System.out.println("End all tests."); 

 }
 
}
