package com.qualityworkscg.common;

import java.io.IOException;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;


public class newControlCenter 
{
  
  public WebDriver driver;
 
  
  @Parameters({ "baseUrl"})
  @BeforeMethod
 public void onTestSetUp(String baseUrl) throws IOException, InterruptedException 
  {
	  final newWebDriverSetup setup = new newWebDriverSetup("new test");
      this.driver = setup.initialize(baseUrl);
      System.out.println("Received This.Driver value is: "+driver);	
}

  @AfterMethod
  public void tearDown() 
  {
	  if (this.driver != null)
  	{
		System.out.println("Browser Closed.");
  		this.driver.quit();
  		

      }
  }
  
}