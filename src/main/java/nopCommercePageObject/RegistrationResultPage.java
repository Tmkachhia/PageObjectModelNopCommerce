package nopCommercePageObject;

import org.openqa.selenium.By;
import org.testng.Assert;

import java.awt.image.ByteLookupTable;

public class RegistrationResultPage extends Utils
{
    private String expected = "Your registration completed";
    private By _actualRegistrationSuccessMessage = By.cssSelector("div.result");
    public void verifyUserSeeRegistrationSuccessMessage()
    {   //verify user is on RegistrationResult page
        assertURL("registerresult");

        //Assert to check registration complete message
        assertTextMessage("pass",expected,_actualRegistrationSuccessMessage);

    }

}
