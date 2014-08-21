package com.kiass.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

        //Find by css selector
        firefoxDriver.findElement(By.cssSelector("#menu_projects a")).click();

        //Find by chaining element
        firefoxDriver.findElement(By.id("mainContent")).findElement(By.className("bigMenu")).findElement(By.linkText("Selenium WebDriver")).click();

        //Find by default return object
        WebElement webelement = firefoxDriver.findElement(By.id("mainContent"));

        //get text from element
        String header = webelement.findElement(By.tagName("h2")).getText();

        //get text from element
        String subheader = webelement.findElement(By.tagName("i")).getText();

        System.out.println("# SHOW HEADER " + header + " #");
        System.out.println("# SHOW SUBHEADER " + subheader + " #");


        //close firefox driver
        firefoxDriver.quit();

    }
}
