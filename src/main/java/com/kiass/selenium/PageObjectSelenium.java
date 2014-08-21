package com.kiass.selenium;

import com.kiass.selenium.pageObject.SearchMavenHome;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by phuthep on 8/21/14.
 */
public class PageObjectSelenium {
    public static void main(String[] args) {
        //start firefox driver
        FirefoxDriver firefoxDriver = new FirefoxDriver();

        //open search maven page
        firefoxDriver.get("http://search.maven.org/");

        SearchMavenHome searchMavenHome = new SearchMavenHome(firefoxDriver);

//        searchMavenHome.searchFor("selenium");
//        searchMavenHome.clickOnRow("selenium");


    }
}
