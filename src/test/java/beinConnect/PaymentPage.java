package beinConnect;

import beinConnect.utilities.base.BasePage;
import beinConnect.utilities.base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class PaymentPage {

    private WebDriver driver = BaseTest.getDriver();
    private BasePage basePage = new BasePage(driver);

    public By totalCharge = By.xpath("(//td[contains(@class,'ncoltxtr')])[2]//small");
    public By cardHolderName = By.xpath("//input[contains(@id,'Ecom_Payment_Card_Name')]");
    public By cardNumber = By.xpath("//input[contains(@id,'Ecom_Payment_Card_Number')]");
    public By cardExpMonth = By.xpath("//select[contains(@id,'Ecom_Payment_Card_ExpDate_Month')]");
    public By cardExpYear = By.xpath("//select[contains(@id,'Ecom_Payment_Card_ExpDate_Year')]");
    public By cardCvc = By.xpath("//input[contains(@id,'Ecom_Payment_Card_Verification')]");
    public By submitPayment = By.name("payment");


    @Step("Total Charge Check Expected: <total>")
    public void totalChargeChck(String expectedTotal) {
        basePage.waitUntilExpectedElementClickable(submitPayment);
        String total = "";
        expectedTotal = expectedTotal + " THB";
        total = driver.findElement(totalCharge).getText();

        Assert.assertEquals(expectedTotal,total);


    }

    @Step("Card Holder Name <cardHolderName>")
    public void cardHolderNameFill(String p_cardHolderName) {

        basePage.fillInputField(cardHolderName, p_cardHolderName);

    }

    @Step("Card Number <cardNumber>")
    public void cardNumberFill(String p_cardNumber) {

        basePage.fillInputField(cardNumber, p_cardNumber);

    }

    @Step("Card Exp Month <cardExpMonth>")
    public void cardExpMonthFill(String p_cardExpMonth) {
        Select dropdownCardMonth = new Select(driver.findElement(cardExpMonth));
        basePage.threadSleep(1000);
        driver.findElement(cardExpMonth).click();
        dropdownCardMonth.selectByVisibleText(p_cardExpMonth);


    }


    @Step("Card Exp Year <cardExpYear>")
    public void cardExpYearFill(String p_cardExpYear) {

        Select dropdownCardYear = new Select(driver.findElement(cardExpYear));
        basePage.threadSleep(1000);
        driver.findElement(cardExpYear).click();
        dropdownCardYear.selectByVisibleText(p_cardExpYear);

    }


    @Step("Card Cvc <cardCvc>")
    public void cardCvcFill(String p_cardCvc) {

        basePage.fillInputField(cardCvc, p_cardCvc);

    }


    @Step("Submit Payment ")
    public void paymentSubmitl() {
        driver.findElement(submitPayment).click();


    }


}
