package nopCommercePageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage
{
    //method to click on element
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }

    //method to enter text
    public static void sendKeys(By by ,String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    //method to get text from url
    public static void assertURL(String text)
    {
        Assert.assertTrue(driver.getCurrentUrl().contains(text));
    }

    //time stamp method to create unique number
    public static String timeStamp()
    {
        return new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
    }

    //method for explicit wait
    public static void waitForClickable(By by,int time)
    {
        WebDriverWait Wait = new WebDriverWait(driver,time);
        Wait.until(ExpectedConditions.elementToBeClickable(by));
    }
   //method to get text from element
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();
    }

    //Assert method to see Expected = Actual
    public static void assertTextMessage(String message ,String expected,By by)
    {
        String actual = getTextFromElement(by);
        Assert.assertEquals(actual,expected,"Failed");
    }

    //method to check url contains specific text
    public static void urlContains(String text)
    {
        driver.getPageSource().contains(text);
    }


    //method to select from drop down by text
    public void selectFromDropDownByText(By by ,String text)
    {
        Select select = new Select(driver.findElement(by));
        select.selectByVisibleText(text);
    }




}
