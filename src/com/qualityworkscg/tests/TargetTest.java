package com.qualityworkscg.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qualityworkscg.base.newBase;

public class TargetTest extends newBase 
{



@Test
  public void verifyTarget () throws InterruptedException 
  {
    
		driver.get("https://www.target.com");
	    Thread.sleep(10000);
    
   
	    System.out.println("Login successful.");
    
    
  }

}