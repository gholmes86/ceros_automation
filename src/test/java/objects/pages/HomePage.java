package objects.pages;

import helpers.Log;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.lang.StringUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.*;
import java.util.ArrayList;

import static junit.framework.Assert.fail;
import static junit.framework.TestCase.assertTrue;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver,20);
    }


    public void getCerosURL(){
        String envName = "";
        if (!StringUtils.isEmpty(System.getProperty("ceros.siteUrl"))) {
            envName = System.getProperty("ceros.siteUrl");
        }
        final String loginUrl = "https://www.ceros.com/inspire";
        driver.get(loginUrl);
    }

    public void clickFilter(String text) throws InterruptedException
    {
        Log.info("Clicking Filter");
        waitForPageToLoad();
        clickElement(driver,By.xpath("//*[@data-value='"+text+"']"),20);
    }

    public void verifyListSize(int total) throws InterruptedException {
        Log.info("verify Indusry total");
        assertTrue(elementIsDisplayed(By.id("industry-dropdown")));
        assertTrue(driver.findElement(By.xpath("//*[contains(@id,'industry-dropdown')]")).findElements(By.tagName("li")).size()==total);
    }
    public void verifyImageDisplay() throws InterruptedException
    {
        Log.info("verify image displays");
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='load_single_post']")));
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='inspire-thumbnail']")));
    }


    public void selectDropdownOption(String text) throws InterruptedException {
        Log.info("Select Dropdown option");
        clickElement(driver,By.xpath("//*[@data-url_value='"+text+"']"),20);
    }
    public void verifyHeader(String text) throws InterruptedException
    {
        Log.info("Verify header");
        assertTrue(elementIsDisplayed(By.xpath("//h2[contains(text(),'"+text+"')]")));

    }
    public void verifysubHeader(String text) throws InterruptedException
    {
        Log.info("Verify sub header");
        assertTrue(elementIsDisplayed(By.xpath("//*[contains(text(),'"+text+"')]")));

    }
    public void verifyBreadcrumbs() throws InterruptedException {
        Log.info("Verify Breadcrumbs");
        assertTrue(elementIsDisplayed(By.xpath("//*[@class='filter-tag categorysearch ng-scope']//h3[@class='category-title ng-binding']")));
        assertTrue(driver.findElements(By.xpath("//*[@class='filter-tag categorysearch ng-scope']//h3[@class='category-title ng-binding']")).size()==3);

    }

    }
























