package com.kiass.selenium.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by phuthep on 8/21/14.
 */
public class SearchMavenHome {
    WebDriver selenium;

    private WebElement inputText;
    private WebElement submitButton;
    private WebElement resultTable;


    public SearchMavenHome(WebDriver selenium) {
        this.selenium = selenium;
    }
    

}
