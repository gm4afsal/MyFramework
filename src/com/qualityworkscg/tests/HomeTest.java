package com.qualityworkscg.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qualityworkscg.base.newBase;

public class HomeTest extends newBase 
{

 

@Test
  public void verifyTitle () throws InterruptedException 
  {
    
	
    
    driver.findElement(By.id("username")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.id("username")).sendKeys("gm4afsal@gmail.com");
    Thread.sleep(2000);
    
    driver.findElement(By.id("password")).click();
    Thread.sleep(2000);
    
    driver.findElement(By.id("password")).sendKeys("Trafford@2020");
    Thread.sleep(2000);
    
    driver.findElement(By.id("Login")).click();
    Thread.sleep(10000);
    
    System.out.println("Login successful.");
    
    
  }

}