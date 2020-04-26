package beinConnect;

import beinConnect.utilities.base.BasePage;
import beinConnect.utilities.base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class selectYourPackagePage {

    private WebDriver driver = BaseTest.getDriver();
    private BasePage basePage = new BasePage(driver);



    @Step("Select your Package <package>")
    public void  yourPackage(String p_yourPackage)
    {
        By selectpackage=By.xpath("(//span[contains(text(),'"+p_yourPackage+"')])[1]//parent::div//a[contains(text(),'SUBSCRIBE')]");
        driver.findElement(selectpackage).click();

    //One Month Pass

    }

    @Step("Package <package> Expected Amount <amount>")
    public void  yourPackage(String p_yourPackage,String expectedAmount)
    {
        By selectpackage=By.xpath("(//span[contains(text(),'"+p_yourPackage+"')])[2]//parent::div//span[2]");
String amount =driver.findElement(selectpackage).getText();
        Assert.assertEquals("฿"+expectedAmount,amount);

    }


    //
}
