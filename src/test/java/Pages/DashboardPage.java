package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class DashboardPage {

    WebDriver driver;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/button/span[2]")
    WebElement learnButton;

    @FindBy(xpath = "//*[@id=\"app-root\"]/nav/div[1]/div[2]/div[1]/div/button[2]/span[2]")
    WebElement learningMaterialButton;

    @FindBy(id = "tab-btn-web")
    WebElement webAutomationAdvanceTab;

    @FindBy(xpath = "//*[@id=\"assessment-instructions\"]/summary")
    WebElement inventoryAutomationForm;

    @FindBy(id = "deviceType")
    WebElement deviceTypeDropdown;

    @FindBy(id = "brand")
    WebElement brandDropdown;

    @FindBy(xpath = "//*[@id=\"inventory-form-grid\"]/div[4]/div/label[2]")
    WebElement storage128GB;

    @FindBy(id = "color")
    WebElement colorDropdown;

    @FindBy(id = "quantity")
    WebElement quantityField;

    @FindBy(id = "address")
    WebElement addressField;

    @FindBy(id = "inventory-next-btn")
    WebElement nextButton;

    @FindBy(id = "shipping-option-express")
    WebElement expressShipping;

    @FindBy(id = "warranty-option-1yr")
    WebElement oneYearWarranty;

    @FindBy(id = "discount-code")
    WebElement discountCodeField;

    @FindBy(id = "apply-discount-btn")
    WebElement applyDiscountButton;

    @FindBy(id = "purchase-device-btn")
    WebElement confirmPurchaseButton;

    @FindBy(id = "view-history-btn")
    WebElement viewInvoiceButton;

    @FindBy(xpath = "//*[@id=\"purchase-success-toast\"]/div[1]/h4")
    WebElement successToast;

    @FindBy(css = "[id^='view-invoice-']")
    WebElement viewOnInvoiceButton;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;
    }

    private void pause() {
        try { Thread.sleep(3000); } catch (InterruptedException e) { Thread.currentThread().interrupt(); }
    }

    public void clickLearn() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(learnButton));
        learnButton.click();
        pause();
    }

    public void clickLearningMaterial() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(learningMaterialButton));
        learningMaterialButton.click();
        pause();
    }

    public void clickWebAutomationAdvance() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(webAutomationAdvanceTab));
        webAutomationAdvanceTab.click();
        pause();
    }

    public void expandInventoryAutomationForm() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(inventoryAutomationForm));
        inventoryAutomationForm.click();
        pause();
    }

    public void selectDeviceType(String deviceType) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(deviceTypeDropdown));
        new Select(deviceTypeDropdown).selectByVisibleText(deviceType);
        pause();
    }

    public void selectBrand(String brand) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(brandDropdown));
        new Select(brandDropdown).selectByVisibleText(brand);
        pause();
    }

    public void selectStorage128GB() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(storage128GB));
        storage128GB.click();
        pause();
    }

    public void selectColor(String color) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(colorDropdown));
        new Select(colorDropdown).selectByVisibleText(color);
        pause();
    }

    public void enterQuantity(String quantity) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(quantityField));
        quantityField.clear();
        quantityField.sendKeys(quantity);
        pause();
    }

    public void enterAddress(String address) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(addressField));
        addressField.clear();
        addressField.sendKeys(address);
        pause();
    }

    public void clickNext() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(nextButton));
        nextButton.click();
        pause();
    }

    public void selectExpressShipping() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(expressShipping));
        expressShipping.click();
        pause();
    }

    public void selectOneYearWarranty() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(oneYearWarranty));
        oneYearWarranty.click();
        pause();
    }

    public void enterDiscountCode(String code) {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(discountCodeField));
        discountCodeField.clear();
        discountCodeField.sendKeys(code);
        pause();
    }

    public void clickApplyDiscount() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(applyDiscountButton));
        applyDiscountButton.click();
        pause();
    }

    public void clickConfirmPurchase() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(confirmPurchaseButton));
        confirmPurchaseButton.click();
        pause();
    }

    public void verifySuccessToast() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(successToast));
        successToast.isDisplayed();
        pause();
    }

    public void clickViewInvoice() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(viewInvoiceButton));
        viewInvoiceButton.click();
        pause();
    }

    public void clickViewOnInvoice() {
        new WebDriverWait(driver, Duration.ofSeconds(15)).until(visibilityOf(viewOnInvoiceButton));
        viewOnInvoiceButton.click();
        pause();
    }

}
