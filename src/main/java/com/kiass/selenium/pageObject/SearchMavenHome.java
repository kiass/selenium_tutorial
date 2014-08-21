package com.kiass.selenium.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import java.util.List;

/**
 * Created by phuthep on 8/21/14.
 */
public class SearchMavenHome {
    WebDriver selenium;

    @FindBy(id = "query")
    private WebElement inputText;

    @FindBy(id = "queryButton")
    private WebElement submitButton;

    @FindBy(id = "resultTable")
    private WebElement resultTable;


    public SearchMavenHome(WebDriver selenium) {
        this.selenium = selenium;
    }

    public SearchMavenHome searchFor(String searchText) {
        inputText.sendKeys(searchText);
        submitButton.click();
        return this;
    }

    public SearchMavenResult clickOnVersion(String version) {
        List<WebElement> webElementList = resultTable.findElements(By.cssSelector("tr td:nth-child(3)"));

        for (WebElement webElement : webElementList) {
            if (webElement.getText().contains(version)) {
                webElement.findElement(By.linkText(version)).click();
                return PageFactory.initElements(selenium, SearchMavenResult.class);

            }

        }
        return null;

    }


}
