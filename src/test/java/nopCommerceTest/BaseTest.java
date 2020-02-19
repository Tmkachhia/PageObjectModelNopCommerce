package nopCommerceTest;

import nopCommercePageObject.BrowserSelector;
import nopCommercePageObject.Utils;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest extends Utils
{
    //before method will run before any method run
    @BeforeTest
   public void openBrowser()
    {
        BrowserSelector.setUpBrowser();
    }


    @AfterTest
    public void closeBrowser(){
       // BrowserSelector.closeBrowser();
    }

}
