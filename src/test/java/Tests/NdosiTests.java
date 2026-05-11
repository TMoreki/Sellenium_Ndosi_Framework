package Tests;

import Utils.ReadFromFile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

@Test
public class NdosiTests extends Base {

    public void verifyHomePageIsDisplayed() {
        homePage.verifyHomePageIsDisplayed();
        takeScreenshots.takeSnapShots(driver, "HomePageScreenshot001");
    }

    @Test(dependsOnMethods = "verifyHomePageIsDisplayed")
    public void clickLoginButton() {
        homePage.clickLoginButton();
    }

    @Test(dependsOnMethods = "clickLoginButton")
    public void userEnterEmail() {
        loginPage.enterEmail(ReadFromFile.email);
    }

    @Test(dependsOnMethods = "userEnterEmail")
    public void userEnterPassword() {
        loginPage.enterPassword(ReadFromFile.password);
    }

    @Test(dependsOnMethods = "userEnterPassword")
    public void userClicksLoginButton() {
        loginPage.clickLoginButton();
    }

    @Test(dependsOnMethods = "userClicksLoginButton")
    public void loginPageIsDisplayed(){
        loginPage.verifyLoginPageIsDisplayed();
    }

    @Test(dependsOnMethods = "loginPageIsDisplayed")
    public void userClicksLearn() {
        dashboardPage.clickLearn();
    }

    @Test(dependsOnMethods = "userClicksLearn")
    public void userClicksLearningMaterial() {
        dashboardPage.clickLearningMaterial();
    }

    @Test(dependsOnMethods = "userClicksLearningMaterial")
    public void userClicksWebAutomationAdvance() {
        dashboardPage.clickWebAutomationAdvance();
    }

    @Test(dependsOnMethods = "userClicksWebAutomationAdvance")
    public void userExpandsInventoryAutomationForm() {
        dashboardPage.expandInventoryAutomationForm();
    }

    @Test(dependsOnMethods = "userExpandsInventoryAutomationForm")
    public void userSelectsDeviceType() {
        dashboardPage.selectDeviceType("Phone");
    }

    @Test(dependsOnMethods = "userSelectsDeviceType")
    public void userSelectsBrand() {
        dashboardPage.selectBrand("Apple");
    }

    @Test(dependsOnMethods = "userSelectsBrand")
    public void userSelectsStorage128GB() {
        dashboardPage.selectStorage128GB();
    }

    @Test(dependsOnMethods = "userSelectsStorage128GB")
    public void userSelectsColor() {
        dashboardPage.selectColor("Blue");
    }

    @Test(dependsOnMethods = "userSelectsColor")
    public void userEntersQuantity() {
        dashboardPage.enterQuantity("2");
    }

    @Test(dependsOnMethods = "userEntersQuantity")
    public void userEntersAddress() {
        dashboardPage.enterAddress("123 Test Street");
    }

    @Test(dependsOnMethods = "userEntersAddress")
    public void userClicksNext() {
        dashboardPage.clickNext();
    }

    @Test(dependsOnMethods = "userClicksNext")
    public void userSelectsExpressShipping() {
        dashboardPage.selectExpressShipping();
    }

    @Test(dependsOnMethods = "userSelectsExpressShipping")
    public void userSelectsOneYearWarranty() {
        dashboardPage.selectOneYearWarranty();
    }

    @Test(dependsOnMethods = "userSelectsOneYearWarranty")
    public void userEntersDiscountCode() {
        dashboardPage.enterDiscountCode("SAVE10");
    }

    @Test(dependsOnMethods = "userEntersDiscountCode")
    public void userClicksApplyDiscount() {
        dashboardPage.clickApplyDiscount();
    }

    @Test(dependsOnMethods = "userClicksApplyDiscount")
    public void userClicksConfirmPurchase() {
        dashboardPage.clickConfirmPurchase();
    }

    @Test(dependsOnMethods = "userClicksConfirmPurchase")
    public void userVerifiesSuccessToast() {
        dashboardPage.verifySuccessToast();
    }

    @Test(dependsOnMethods = "userVerifiesSuccessToast")
    public void userClicksViewInvoice() {
        dashboardPage.clickViewInvoice();
    }

    @Test(dependsOnMethods = "userClicksViewInvoice")
    public void userClicksViewOnInvoice() {
        dashboardPage.clickViewOnInvoice();
    }

    @AfterTest
    public void closeBrowser() {
        driver.quit();
    }

}
