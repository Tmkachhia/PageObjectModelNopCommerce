package nopCommerceTest;

import nopCommercePageObject.*;
import org.testng.annotations.Test;

public class TestSuits extends BaseTest
{
    //created objects for class to call methods
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    JeweleryPage jeweleryPage= new JeweleryPage();
    JeweleryComparisionPage jeweleryComparisionPage = new JeweleryComparisionPage();
    WishListPage wishListPage = new WishListPage();
    ComputerPage computerPage= new ComputerPage();
    DesktopPage desktopPage = new DesktopPage();
    EmailWishList emailWishList = new EmailWishList();
    ElectronicPage electronicPage = new ElectronicPage();
    CameraPhotosPage cameraPhotosPage = new CameraPhotosPage();
    LoginPage loginPage = new LoginPage();
    ReferProduct referProduct = new ReferProduct();


    @Test
    public void userShouldAbleToRegisterSuccessfully()
    {
        //click on Register Button
        homePage.clickOnRegisterButton();
       //verify user on Registration page
        registrationPage.verifyUserIsOnRegistrationPage();
        //fill up registration details
        registrationPage.userEnterRegistrationDetails();
        //verify registration success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }
    @Test
    public void userShouldAbleToCompareTwoDifferentProductSuccessfully()
    {
        //calling method to click on jewelery
        homePage.clickOnJewelery();
        jeweleryPage.verifyUserOnJeweleryPage();
        //calling method to compare product from jeweleryPage
        jeweleryPage.chooseProductToCompare();
        jeweleryComparisionPage.verifyUserIsOnJeweleryComparisionPage();

    }
    @Test
    public void registeredUserShouldAbleToReferProductToFriend()
    {
        homePage.clickOnLogin();
        loginPage.userEnterLoginDetails();

        homePage.clickOnComputer();
        computerPage.clickOnDesktop();
        desktopPage.userSelectItemToReferFriend();
        //calling method to click on email to friend
        referProduct.emailProduct();

        emailWishList.enterEmailAddressOfFriend();
        emailWishList.sendEmailToFriend();
        emailWishList.verifyUserSeeEmailSentMessage();
    }
    @Test
    public void notRegisteredUserCanNotReferItemToFriend()
    {
        homePage.clickOnComputer();
        computerPage.clickOnDesktop();
        desktopPage.userSelectItemToReferFriend();
       referProduct.emailProduct();
        emailWishList.enterEmailAddressOfFriend();

        //calling method to click on send email
        emailWishList.sendEmailToFriend();
        //verify user see error message
       emailWishList.verifyNotRegisterUserSeeErrorMessage();
    }
    @Test
    public void userShouldAbleToSortProductHighToLowByPrice()
    {
        homePage.clickOnElectronics();
        electronicPage.clickOnCameraAndPhotos();
        cameraPhotosPage.useSelectFromPositionPriceHighToLow();
        cameraPhotosPage.pricesFromElement();

    }

}

