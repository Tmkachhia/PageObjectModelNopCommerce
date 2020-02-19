package nopCommercePageObject;

import org.openqa.selenium.By;

public class HomePage extends Utils
{   //variable/locators
    private By _registerLink = By.xpath("//a[contains(@class,'register')]");
    private By _Jewelery =By.xpath("//ul[contains(@class,'notmobile')]//li//a[contains(text(),'Jewelry ')] ");
    private By _computer =By.xpath("//ul[contains(@class,'notmobile')]//a[contains(text(),'Computers ')]");
    private By _desktop =By.xpath("//div[contains(@class,'category')]//h2//a[contains(@title,'Desktops')]");
    private By _electronics = By.xpath("//ul[contains(@class,'notmobile')]//li/a[contains(text(),'Electronics ')]");
    private By _loginbutton = By.className("ico-login");

    //click on register button
    public void clickOnRegisterButton()
    {
        clickOnElement(_registerLink);
    }
    //click on jewelery button
    public void clickOnJewelery()
    {
        clickOnElement(_Jewelery);
    }
    //click on computer button
    public void clickOnComputer(){
        clickOnElement(_computer);
    }
    public void clickOnDesktop()
    {
        clickOnElement(_desktop);
    }
    //click on Electronics
    public void clickOnElectronics()
    {
        clickOnElement(_electronics);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    //click on login button
    public void clickOnLogin()
    {
        clickOnElement(_loginbutton);
    }

}
