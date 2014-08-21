package com.kiass.selenium.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by phuthep on 8/21/14.
 */
public class SearchMavenResult {
    WebDriver selenium;


    @FindBy(id = "dependencyMavenXml")
    WebElement dependencyMavenXml;

    public SearchMavenResult(WebDriver selenium) {
        this.selenium = selenium;
    }

    public String getMavenConfigure() {
        return dependencyMavenXml.getText();


    }

}
