package com.absa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestMethods extends BaseClass {

    static WebDriver driver;

    public static void navigateToWebsite() {
        System.setProperty("webdriver.chrome.driver", "chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to(TestData.WEBSITE_URL);
    }

    public static void clickNewUser() {
        driver.findElement(By.xpath("//button[contains(text(),'Add User')]")).click();
    }

    public static void enterUserOneDetails(){
        By firstNameField = By.name("FirstName");
        getElement(driver,firstNameField).clear();
        getElement(driver,firstNameField).sendKeys(TestData.USER_ONE_FIRST_NAME);

        By lastNameField =  By.name("LastName");
        getElement(driver,lastNameField).clear();
        getElement(driver,lastNameField).sendKeys(TestData.USER_ONE_LAST_NAME);

        By userNameField =  By.name("UserName");
        getElement(driver,userNameField).clear();
        getElement(driver,userNameField).sendKeys(TestData.GENERATE_UNSERNAME);

        By passwordField =  By.name("Password");
        getElement(driver,passwordField).clear();
        getElement(driver,passwordField).sendKeys(TestData.USER_ONE_PASSWORD);

        By customerSelectionButton = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Role'])" +
                "[2]/preceding::input[2]");
        getElement(driver,customerSelectionButton).click();

        By roleDropDown = By.name("RoleId");
        getElement(driver,roleDropDown).click();
        new Select(driver.findElement(By.name("RoleId"))).selectByVisibleText("Admin");
        getElement(driver,roleDropDown).click();

        By emailField =  By.name("Email");
        getElement(driver,emailField).clear();
        getElement(driver,emailField).sendKeys(TestData.USER_ONE_EMAIL);

        By cellNumberField =  By.name("Mobilephone");
        getElement(driver,cellNumberField).clear();
        getElement(driver,cellNumberField).sendKeys(TestData.USER_ONE_CELL);

        By saveButton = By.xpath(("(.//*[normalize-space(text()) and normalize-space(.)='Close'])" +
                "[1]/following::button[1]"));
        getElement(driver,saveButton).click();

    }

    public static void enterUserTwoDetails(){
        By firstNameField = By.name("FirstName");
        getElement(driver,firstNameField).clear();
        getElement(driver,firstNameField).sendKeys(TestData.USER_TWO_FIRST_NAME);

        By lastNameField =  By.name("LastName");
        getElement(driver,lastNameField).clear();
        getElement(driver,lastNameField).sendKeys(TestData.USER_TWO_LAST_NAME);

        By userNameField =  By.name("UserName");
        getElement(driver,userNameField).clear();
        getElement(driver,userNameField).sendKeys(TestData.GENERATE_UNSERNAME);

        By passwordField =  By.name("Password");
        getElement(driver,passwordField).clear();
        getElement(driver,passwordField).sendKeys(TestData.USER_TWO_PASSWORD);

        By customerSelectionButton = By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Role'])" +
                "[2]/preceding::input[1]");
        getElement(driver,customerSelectionButton).click();

        By roleDropDown = By.name("RoleId");
        getElement(driver,roleDropDown).click();
        new Select(driver.findElement(By.name("RoleId"))).selectByVisibleText("Admin");
        getElement(driver,roleDropDown).click();

        By emailField =  By.name("Email");
        getElement(driver,emailField).clear();
        getElement(driver,emailField).sendKeys(TestData.USER_TWO_EMAIL);

        By cellNumberField =  By.name("Mobilephone");
        getElement(driver,cellNumberField).clear();
        getElement(driver,cellNumberField).sendKeys(TestData.USER_TWO_CELL);

        By saveButton = By.xpath(("(.//*[normalize-space(text()) and normalize-space(.)='Close'])" +
                "[1]/following::button[1]"));
        getElement(driver,saveButton).click();

    }

    public static void verifyAddedUsers(){

        By addedUserOne = By.xpath("body > table > tbody > tr.smart-table-data-row.ng-scope.selected > " +
                "td:nth-child(2)");
        getElement(driver,addedUserOne).getText();
        System.out.println(addedUserOne);

    }

}
