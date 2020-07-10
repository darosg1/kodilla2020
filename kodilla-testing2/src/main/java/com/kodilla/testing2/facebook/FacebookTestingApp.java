package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String XPATH_INPUT = "//div[contains(@class,\"_5dbb\")]/div/input";
    public static final String XPATH_INPUT2 = "//div[contains(@class,\"mbm _1iy_ _a4y rfloat _ohf\")]/div/div/input";
    public static final String XPATH_INPUT3 = "//div[contains(@class,\"mbm _a4y\")]/div/div/input";
    public static final String XPATH_INPUT4 = "//div[contains(@class,\"mbm _br- _a4y\")]/div/div/input";
    public static final String SELECT_FACEBOOK_DAY = "//span[contains(@class,\"_5k_4\")]/span/select[1]";
    public static final String SELECT_FACEBOOK_MONTH = "//span[contains(@class,\"_5k_4\")]/span/select[2]";
    public static final String SELECT_FACEBOOK_YEAR = "//span[contains(@class,\"_5k_4\")]/span/select[3]";

    public static void main(String[] args){
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");

        WebElement searchName = driver.findElement(By.xpath(XPATH_INPUT));
        searchName.sendKeys ("Darek");

        WebElement searchLastname = driver.findElement (By.xpath(XPATH_INPUT2));
        searchLastname.sendKeys ("KodillaTest");

        WebElement searchPhone = driver.findElement (By.xpath(XPATH_INPUT3));
        searchPhone.sendKeys ("+48 111 test");

        WebElement searchPassword = driver.findElement (By.xpath(XPATH_INPUT4));
        searchPassword.sendKeys ("Password");

        WebElement selectDay = driver.findElement (By.xpath(SELECT_FACEBOOK_DAY));
        Select selectD = new Select (selectDay);
        selectD.selectByIndex(23);

        WebElement selectMonth = driver.findElement (By.xpath(SELECT_FACEBOOK_MONTH));
        Select selectM = new Select (selectMonth);
        selectM.selectByIndex(4);

        WebElement selectYear = driver.findElement (By.xpath(SELECT_FACEBOOK_YEAR));
        Select selectY = new Select (selectYear);
        selectY.selectByIndex(42);
    }
}
