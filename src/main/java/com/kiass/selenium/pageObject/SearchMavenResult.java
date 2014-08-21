package com.kiass.selenium.pageObject;

import org.openqa.selenium.WebDriver;

/**
 * Created by phuthep on 8/21/14.
 */
public class SearchMavenResult {
    WebDriver selenium;

    private WebDriver artifactDetailsDependencyInfo;
    private WebDriver mavenDependecy;
    private WebDriver groovyDependecy;


    public SearchMavenResult(WebDriver selenium) {
        this.selenium = selenium;
    }


}
