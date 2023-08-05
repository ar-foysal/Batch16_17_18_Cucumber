package pages;

import org.openqa.selenium.*;

import static utilities.DriverSetup.getDriver;

public class BasePage {

    public WebElement getElement(By locator){
        return getDriver().findElement(locator);
    }

    public void clickOnAElement(By locator){
        getElement(locator).click();
    }

    public void writeOnByLocator(By locator, String text){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }

    public String getElementText(By locator){
       return getElement(locator).getText();
    }

}
