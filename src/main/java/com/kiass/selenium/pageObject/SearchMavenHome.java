package com.kiass.selenium.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import java.util.List;

/**
 * Created by phuthep on 8/21/14.
 */
public class SearchMavenHome {
    WebDriver selenium;

    private By inputText = By.id("query");
    private By submitButton = By.id("queryButton");
    private By resultTable = By.id("resultTable");


    public SearchMavenHome(WebDriver selenium) {
        this.selenium = selenium;
    }

    public SearchMavenHome searchFor(String searchText) {
        selenium.findElement(inputText).sendKeys(searchText);
        selenium.findElement(submitButton).click();
        return this;
    }

    public SearchMavenResult clickOnVersion(String version) {
        List<WebElement> webElementList = selenium.findElement(resultTable).findElements(By.cssSelector("tr td:nth-child(3)"));

        for (WebElement webElement : webElementList) {
            if (webElement.getText().contains(version)) {
                webElement.findElement(By.linkText(version)).click();
                return new SearchMavenResult(selenium);
            }

        }
        return null;

    }


}
