package nopCommercePageObject;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils
{
  public static void setUpBrowser()
  { //path to chrome driver
    System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowsersDriver\\chromedriver.exe");
    //initialize chrome driver
    driver = new ChromeDriver();
    //implicit wait
    driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
    driver.manage().window().fullscreen();
    //navigate to website
    driver.get("http://demo.nopcommerce.com/");
  }

    public static void closeBrowser(){
        driver.close();
      }


}
