package com.qualityworkscg.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qualityworkscg.base.newBase;

public class AmazonTest extends newBase 
{

 

@Test
  public void verifyAmazon() throws InterruptedException 
  {
    

	driver.get("https://www.amazon.com");
	Thread.sleep(3000);
    
    System.out.println("Login successful.");
    
    
  }

}
