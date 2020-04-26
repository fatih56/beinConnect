package beinConnect;

import beinConnect.utilities.base.BasePage;
import beinConnect.utilities.base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class selectPackagePage {


    private WebDriver driver = BaseTest.getDriver();
    private BasePage basePage = new BasePage(driver);

@Step("Select Package <package>")
    public void selectPackage(String packageName)
{
    By selectedPackage= By.xpath("//span[contains(text(),'"+packageName+"')]//parent::div");
    driver.findElement(selectedPackage).click();


}




}
