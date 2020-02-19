package nopCommercePageObject;

import org.openqa.selenium.By;

public class ElectronicPage extends Utils
{
    //variable/locator
    private By _cameraAndPhotos = By.xpath("//h2[@class='title']//a[contains(@title,'Camera')]");
        //click on  item
    public void clickOnCameraAndPhotos()
    {
        clickOnElement(_cameraAndPhotos);
    }

}
