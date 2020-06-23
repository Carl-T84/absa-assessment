package com.absa;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;


public abstract class BaseClass {

    static WebDriver driver;

    public static WebElement getElement(WebDriver driver, By locator) {
        WebElement element = driver.findElement(locator);
        return element;
    }

    public static WebElement doClick(WebDriver driver, By locator) {
        return driver.findElement(locator);
    }


    public static int getRandInt(){
        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);
        return rand_int1;
    }

}
