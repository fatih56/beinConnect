package beinConnect;

import beinConnect.utilities.base.BasePage;
import beinConnect.utilities.base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentMethodPage {

    private WebDriver driver = BaseTest.getDriver();
    private BasePage basePage = new BasePage(driver);


    public By term = By.name("checkTerms");
    public By paymentTypeCombobox = By.xpath("//span[contains(@role,'combobox')]");
    public By submitPaymentType = By.name("pay-now");

    ////li[contains(text(),'Credit Card Recurring')]



    @Step("Payment Type <payment>")
    public void paymantTypeSelect(String p_paymentType) {

        By type = By.xpath("//li[contains(text(),'" + p_paymentType + "')]");
        driver.findElement(paymentTypeCombobox).click();
        driver.findElement(type).click();


    }

    @Step("Term check")
    public void termCheck() {
          basePage.clickWithJS(term);

    }

    @Step("Submit PaymentMethod")
    public void submitPayment() {
        driver.findElement(submitPaymentType).click();

    }


}
