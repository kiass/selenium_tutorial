package com.kiass.selenium;

import com.kiass.selenium.pageObject.SearchMavenHome;
import com.kiass.selenium.pageObject.SearchMavenResult;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import java.util.concurrent.TimeUnit;

/**
 * Created by phuthep on 8/21/14.
 */
public class PageObjectSelenium {
    public static void main(String[] args) {
        //start firefox driver
        //http://chromedriver.storage.googleapis.com/index.html?path=2.9/

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        WebDriver driver = new ChromeDriver();


        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        //open search maven page
        driver.get("http://search.maven.org/");


        //open search maven page
        SearchMavenHome searchMavenHome = PageFactory.initElements(driver, SearchMavenHome.class);

        //search maven library
        searchMavenHome.searchFor("selenium-java");

        //click on version and go to another page
        SearchMavenResult searchMavenResult = searchMavenHome.clickOnVersion("2.42.2");

        //get dependency
        String dependencyText = searchMavenResult.getMavenConfigure();

        System.out.println(dependencyText);

        driver.quit();
    }
}
