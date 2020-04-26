package beinConnect;

import beinConnect.utilities.base.BasePage;
import beinConnect.utilities.base.BaseTest;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage  {

    private WebDriver driver = BaseTest.getDriver();
    private BasePage basePage = new BasePage(driver);

    public By  pageLoading=By.id("loading");
    public By  subscribeButton=By.xpath("//li[contains(@class,'subscribe')]");

    @Step("URL <url>")
    public void  navigate (String url)
    { driver.navigate().to(url); }


    @Step("Wait Spinner")
    public void spinnerWait()
    {
        basePage.spinnerWait(pageLoading);

    }



    @Step("Subscribe Click")
    public void subscribeClick()
    {
        driver.findElement(subscribeButton).click();
    }





}
