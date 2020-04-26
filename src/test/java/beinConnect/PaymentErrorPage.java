package beinConnect;

import beinConnect.utilities.base.BasePage;
import beinConnect.utilities.base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentErrorPage {

    private WebDriver driver = BaseTest.getDriver();
    private BasePage basePage = new BasePage(driver);

    public By cancelButton = By.id("ncol_cancel");
    public By errorMessage = By.xpath("//td[contains(@class,'ncoltxtc')]//h3");


    @Step("Payment Error Message <Message>")
    public void errorMessageChck(String expectedErrorMessage) {
        basePage.waitUntilExpectedElementClickable(cancelButton);

        String p_erroressage = driver.findElement(errorMessage).getText();
        basePage.logger("ErrorMessage"+p_erroressage);
        Assert.assertEquals(expectedErrorMessage, p_erroressage);


    }

}
