package nopCommercePageObject;

import org.testng.Assert;

public class JeweleryComparisionPage extends Utils
{       //method to confirm user navigated to comparision page
    public void verifyUserIsOnJeweleryComparisionPage()
    {
        assertURL("compareproducts");
         urlContains ("compareproducts");
    }
}
