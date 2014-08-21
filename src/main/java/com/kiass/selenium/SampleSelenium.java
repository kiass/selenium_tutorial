package com.kiass.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by phuthep on 8/21/14.
 */
public class SampleSelenium {
    public static void main(String[] args) {
        //start firefox driver
        FirefoxDriver firefoxDriver = new FirefoxDriver();

        //open selnium web page
        firefoxDriver.get("http://www.seleniumhq.org");

        //find input text element and send text
        firefoxDriver.findElement(By.id("q")).sendKeys("selenium");

        //find submit button and click
        firefoxDriver.findElement(By.id("submit")).click();

        //close firefox driver
        firefoxDriver.quit();

    }
}
