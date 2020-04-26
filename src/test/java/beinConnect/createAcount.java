package beinConnect;

import beinConnect.utilities.base.BasePage;
import beinConnect.utilities.base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class createAcount {
    Random rand=new Random();
    private WebDriver driver = BaseTest.getDriver();
    private BasePage basePage = new BasePage(driver);

    public By firstName=By.name("FirstName");
    public By lastName=By.name("LastName");
    public By emailOrPhone=By.name("EmailOrPhone");
    public By password=By.name("Password");
    public By communicationPermission=By.name("HasCommunicationPermission");
    public By createAccountButton=By.xpath("//input[contains(@type,'submit')]");
    public By infoClose=By.xpath("//div[contains(@class,'form-header')]//a[contains(@id,'close')]");
    @Step("First Name <firstName>")
    public  void firstNameFill(String p_firstName)
    {

        WebDriverWait wait = new WebDriverWait(driver, 10);
        basePage.waitUntilExpectedElementClickable(createAccountButton);
        basePage.fillInputField(firstName,p_firstName);

    }

    @Step("Last Name <lastName>")
    public  void lastNameFill(String p_lastName)
    {

        basePage.fillInputField(lastName,p_lastName);

    }

    @Step("Email Or Phone <emailOrPhone>")
    public  void emailOrPhoneFill(String p_emailOrPhone)
    {
        int random=rand.nextInt(1000000000);
if(p_emailOrPhone.toUpperCase().equals("RANDOM")) {
    basePage.fillInputField(emailOrPhone, "test"+random+"@test.com");
}
else
{
    basePage.fillInputField(emailOrPhone, p_emailOrPhone);

}
    }

    @Step("Password <password>")
    public  void passwordFill(String p_password)
    {

        basePage.fillInputField(password,p_password);

    }


    @Step("Communication Permission <communicationPermission>")
    public  void communicationPermissionFill(Boolean p_communicationPermission)
    {
        if (p_communicationPermission) {
         //   driver.findElement(communicationPermission).click();
       basePage.clickWithJS(communicationPermission);

        }

    }

    @Step("Create Account Submit Click ")
    public  void communicationPermissionFill() {

        driver.findElement(createAccountButton).click();
    }

    @Step("Info Close")
    public void infoClose()
    {
     basePage.waitUntilExpectedElementClickable(infoClose);
        driver.findElement(infoClose).click();

    }


}
