package com.kiass.selenium.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by phuthep on 8/21/14.
 */
public class SearchMavenResult {
    WebDriver selenium;


    By dependencyMavenXml = By.id("dependencyMavenXml");

    public SearchMavenResult(WebDriver selenium) {
        this.selenium = selenium;
    }

    public String getMavenConfigure() {
        return selenium.findElement(dependencyMavenXml).getText();


    }

}
