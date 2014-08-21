package com.kiass.selenium;

import com.kiass.selenium.pageObject.SearchMavenHome;
import com.kiass.selenium.pageObject.SearchMavenResult;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

/**
 * Created by phuthep on 8/21/14.
 */
public class PageObjectSelenium {
    public static void main(String[] args) {
        //start firefox driver
        FirefoxDriver firefoxDriver = new FirefoxDriver();

        firefoxDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //open search maven page
        firefoxDriver.get("http://search.maven.org/");


        //open search maven page
        SearchMavenHome searchMavenHome = PageFactory.initElements(firefoxDriver, SearchMavenHome.class);

        //search maven library
        searchMavenHome.searchFor("selenium-java");

        //click on version and go to another page
        SearchMavenResult searchMavenResult = searchMavenHome.clickOnVersion("2.42.2");

        //get dependency
        String dependencyText = searchMavenResult.getMavenConfigure();

        System.out.println(dependencyText);

        firefoxDriver.quit();
    }
}
