package com.qualityworkscg.common;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class  newWebDriverSetup 
{
  public WebDriver driver;
  private String testName;
  
  public newWebDriverSetup() 
  {
      this.testName = "";
  }
  
  public newWebDriverSetup(final String testName) 
  {
      this.testName = "";
      this.testName = testName;
  }
  
  public WebDriver getDriver() 
  {
      return this.driver;
  }
  

  public WebDriver initialise(final String baseUrl) throws MalformedURLException 
  {
	  return this.initialize(baseUrl);
  }
  
  public WebDriver initialize(final String baseUrl) throws MalformedURLException 
  {
  
	  System.out.println("Browser: Chrome");
      
      WebDriverManager.chromedriver().setup();
    
      DesiredCapabilities capabilities = new DesiredCapabilities();
      
      ChromeOptions options = new ChromeOptions();
      
      
      options.merge(capabilities);

     // options.addArguments("--headless");
      
      options.addArguments("start-maximized"); 
      options.addArguments("enable-automation"); 
      options.addArguments("--no-sandbox"); 
      options.addArguments("--disable-infobars"); 
      options.addArguments("--disable-dev-shm-usage"); //Linux 
      options.addArguments("--disable-browser-side-navigation"); 
      options.addArguments("--disable-gpu"); //Windows
      
      options.addArguments("--disable-web-security");
      

     //driver = new RemoteWebDriver(new URL("http://3.129.9.62:4444/wd/hub"),options);
	  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options);
     // driver= new ChromeDriver(options);
      
      driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
      
      driver.get(baseUrl);
      
    //  driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),options);
      

    return this.driver;

    
  }

}
